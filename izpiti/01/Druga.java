
// 63170196
// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    //=========================================================================
    public static class Predmet {
        private String naziv;
        private int kreditneTocke;
        private boolean strokovni;
        private int dan;

        public Predmet(String naziv, int kreditneTocke, boolean strokovni, int dan) {
            this.naziv = naziv;
            this.kreditneTocke = kreditneTocke;
            this.strokovni = strokovni;
            this.dan = dan;
        }

        // po potrebi dodajte svoje metode ...

        public String vrniNaziv() {
            return this.naziv;
        }

        public boolean jeStrokovni() {
            return this.strokovni;
        }

        public int vrniKreditneTocke() {
            return this.kreditneTocke;
        }

        public int vrniDan () {
            return dan;
        }
    }

    //=========================================================================
    public static class Student {
        private String ime;
        private Predmet[] predmeti;
        public int[] ocene;

        public Student(String ime, Predmet[] predmeti, int[] ocene) {
            this.ime = ime;
            this.predmeti = predmeti;
            this.ocene = ocene;
        }

        // po potrebi dodajte svoje metode ...

        public String vrniIme() {
            return this.ime;
        }

        public boolean imaProstoIzbirni() {
            for (int i = 0; i < predmeti.length; i++) {
                if (!predmeti[i].strokovni)
                    return true;
            }
            return false;
        }

        public int[] steviloKT() {
            int ktEna = 0;
            int ktDva = 0;
            for (int i = 0; i < ocene.length; i++) {
                if (ocene[i] > 5) {
                    boolean strokovni = predmeti[i].jeStrokovni();
                    if (strokovni)
                        ktEna += predmeti[i].kreditneTocke;
                    else
                        ktDva += predmeti[i].kreditneTocke;
                }
            }
            int [] tabela = new int [2];
            tabela [0] = ktEna;
            tabela [1] = ktDva;
            return tabela;
        }

        public Predmet [] vrniPredmete() {
            return predmeti;
        }

        public int [] vrniOcene() {
            return ocene;
        }
    }

    //=========================================================================
    public static class Letnik {
        private Student[] studenti;

        public Letnik(Student[] studenti) {
            this.studenti = studenti;
        }

        // po potrebi dodajte svoje metode ...

        public int steviloNeuspesnih() {
            int stevec = 0;
            for (int i = 0; i < studenti.length; i++) {
                Predmet [] predmeti = studenti[i].vrniPredmete();
                boolean niUspesen = true;
                int [] ocene = studenti[i].ocene;
                for (int j = 0; j < predmeti.length; j++) {
                    if (ocene[j] > 5)
                        niUspesen = false;
                }
                if (niUspesen)
                    stevec++;
            }
            return stevec;
        }

        public int morebitnaPrekrivanja(int dan) {
            int stevec = 0;

            for (int i = 0; i < studenti.length; i++) {
                Predmet [] predmeti = studenti[i].vrniPredmete();
                boolean sePrekriva = false;
                for (int j = 0; j < predmeti.length; j++) {
                    if (predmeti[j].vrniDan() == dan && sePrekriva) {
                        stevec ++;
                        break;
                    }
                    else if (predmeti[j].vrniDan() == dan) {
                        sePrekriva = true;
                    }
                }
            }
            return stevec;
        }
    }
}
