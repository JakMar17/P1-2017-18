import java.util.*;

class DN08_63170196 {
    private static Scanner sc = new Scanner(System.in);
    private static int obrestiP;
    private static int obrestiN;
    private static int stUkaz;
    private static char ukaz;

    private static int dDan = 0;
    private static int dMesec = 0;
    private static int dLeto = 0;
    private static String naziv;
    private static int mMinus;
    private static int dDvig;
    private static int mDvig;
    private static int znesek;

    private static String[][] racuni;
    private static int stRacunov = 0;

    public static void main(String[] args) {

        inicializacija();
        sc.nextLine();

        int korakov = stUkaz;
        racuni = new String[7][stUkaz];

        while (korakov != 0) {
            branje();
            switch (ukaz) {
            case 'r':
                ustvariRacun();
                break;
            case '+':
                polog();
                break;
            case '-':
                dvig();
                break;
            }
            korakov--;
        }
    }

    private static void inicializacija() {
        obrestiP = sc.nextInt();
        obrestiN = sc.nextInt();
        stUkaz = sc.nextInt();
    }

    private static void branje() {
        String niz = sc.nextLine();
        int i = 1;
        char a;

        ukaz = niz.charAt(0);

        String beseda = "";
        for (i++; niz.charAt(i) != ' '; i++) {
            a = niz.charAt(i);
            beseda += a;
        }
        int dan = Integer.parseInt(beseda);

        beseda = "";
        for (i++; niz.charAt(i) != ' '; i++) {
            a = niz.charAt(i);
            beseda += a;
        }
        int mesec = Integer.parseInt(beseda);

        beseda = "";
        for (i++; niz.charAt(i) != ' '; i++) {
            a = niz.charAt(i);
            beseda += a;
        }
        int leto = Integer.parseInt(beseda);

        datumi(dan, mesec, leto);
        naziv = "";
        for (i++; niz.charAt(i) != ' '; i++) {
            a = niz.charAt(i);
            naziv += a;
        }

        if (ukaz == 'r') {
            beseda = "";
            for (i++; niz.charAt(i) != ' '; i++) {
                a = niz.charAt(i);
                beseda += a;
            }

            mMinus = Integer.parseInt(beseda);

            beseda = "";
            for (i++; niz.charAt(i) != ' '; i++) {
                a = niz.charAt(i);
                beseda += a;
            }
            dDvig = Integer.parseInt(beseda);

            beseda = "";
            for (i++; i < niz.length(); i++) {
                a = niz.charAt(i);
                beseda += a;
            }
            mDvig = Integer.parseInt(beseda);
        }

        else {
            beseda = "";
            for (i++; i < niz.length(); i++) {
                a = niz.charAt(i);
                beseda += a;
            }
            znesek = Integer.parseInt(beseda);
        }

    }

    private static void ustvariRacun() {
        if (dDvig == -1)
            dDvig = 999999999;
        if (mDvig == -1)
            mDvig = 999999999;
        if (mMinus == -1)
            mMinus = 999999999;
        mMinus *= -1;

        racuni[0][stRacunov] = naziv + "";
        racuni[1][stRacunov] = mMinus + "";
        racuni[2][stRacunov] = dDvig + "";
        racuni[3][stRacunov] = mDvig + "";
        racuni[4][stRacunov] = "0";
        racuni[5][stRacunov] = dDvig + ""; //se odsteje pri dvigu; resetira vsak nov dan
        racuni[6][stRacunov] = mDvig + ""; //se odsteje pri dvigu; resetira vsak nov mesec
        stRacunov++;
        System.out.println("OK");
    }

    private static void polog() {
        int stRacuna = getStRacun();
        int novoStanje = getVrednost(stRacuna);
        novoStanje += znesek;
        setVrednost(stRacuna, novoStanje);
        System.out.println(getVrednost(stRacuna));
    }

    private static void dvig() {
        int stRacuna = getStRacun();
        int novoStanje = getVrednost(stRacuna);
        novoStanje -= znesek;
        if (novoStanje < getmMinus(stRacuna))
            System.out.println("N");
        else if (getDosedanjiDnevni(stRacuna) - znesek < 0)
            System.out.println("D");
        else if (getDosedanjiMesecni(stRacuna) - znesek < 0)
            System.out.println("M");
        else {
            setVrednost(stRacuna, novoStanje);
            setDosedanjiDnevni(stRacuna, znesek);
            setDosedanjiMesecni(stRacuna, znesek);
            System.out.println(getVrednost(stRacuna));
        }
    }

    private static int getStRacun() {
        String s = "";
        int i = 0;

        while (1 != 0) {
            s = racuni[0][i];
            if (s.equals(naziv))
                return i;
            i++;
        }
    }

    private static int getmMinus(int st) {
        String s = racuni[1][st];
        return (Integer.parseInt(s));
    }

    private static int getdDvig(int st) {
        String s = racuni[2][st];
        return (Integer.parseInt(s));
    }

    private static int getmDvig(int st) {
        String s = racuni[3][st];
        return (Integer.parseInt(s));
    }

    private static int getVrednost(int st) {
        String s = racuni[4][st];
        return (Integer.parseInt(s));
    }

    private static void setVrednost(int st, int novoStanje) {
        racuni[4][st] = novoStanje + "";
    }

    private static int getDosedanjiDnevni(int st) {
        String s = racuni[5][st];
        return (Integer.parseInt(s));

    }

    private static void setDosedanjiDnevni(int st, int znesek) {
        int x = getDosedanjiDnevni(st);
        x -= znesek;
        racuni[5][st] = x + "";
    }

    private static int getDosedanjiMesecni(int st) {
        String s = racuni[6][st];
        return (Integer.parseInt(s));
    }

    private static void setDosedanjiMesecni(int st, int znesek) {
        int x = getDosedanjiMesecni(st);
        x -= znesek;
        racuni[6][st] = x + "";
    }

    private static void datumi(int dan, int mesec, int leto) {
        int x = 0;
        int y = 0;
        if (dan != dDan && dDan != 0)
            resetDan();
        if (leto != dLeto && dLeto != 0) {
            x = leto - dLeto * 12;
        }
        if (mesec != dMesec && dMesec != 0) {
            y = x - dMesec + mesec;
            resetMesec();
            while (y > 0) {
                obresti();
                y--;
            }
        }

        dDan = dan;
        dMesec = mesec;
        dLeto = leto;
    }

    private static void resetDan() {
        for (int i = 0; i < stRacunov; i++) {
            int x = getdDvig(i);
            racuni[5][i] = x + "";
        }
    }

    private static void resetMesec() {
        for (int i = 0; i < stRacunov; i++) {
            int x = getmDvig(i);
            racuni[6][i] = x + "";
        }
    }

    private static void obresti() {
        for (int i = 0; i < stRacunov; i++) {
            int x = getVrednost(i);
            if (x > 0 && obrestiP != 0) {
                double c = Math.floor(x * obrestiP / 1000);
                setVrednost(i, (int) (x + c));
            } else if (x < 0 && obrestiN != 0) {
                double c = Math.floor(-x * obrestiN / 1000);
                setVrednost(i, (int) (x - c));
            }
        }
    }
}