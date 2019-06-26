import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

class DN05_63170196 {
    public static Scanner sc = new Scanner (System.in);
    
    public static void main ( String [] args ) {
        int dolzinaPolja = sc.nextInt() ;
        int dolzinaBarve = sc.nextInt();
        int cena = sc.nextInt();
        int stIgralci = sc.nextInt();
        int stIgralciOSN = stIgralci;
        int zacetniDenar = sc.nextInt();
        int stMetov = sc.nextInt();
        int igralec = 0;

        int [] lastnistvo = new int [dolzinaPolja];
        int [] skupina = new int [dolzinaPolja];
        int [] denar = new int [stIgralci];
        int [] lokacija = new int [stIgralci];

        lastnistvo = polni(lastnistvo, -1);
        denar = polni(denar, zacetniDenar);
        lokacija = polni(lokacija, 0);

        int a = 1;
        zanka:
        while (stMetov != 0) {
            if (igralec == stIgralci)
                igralec = 0;
            if (denar[igralec] == -1) {
                a++;
                if (a > stIgralciOSN)
                    break zanka;
                continue zanka;
            }
            
            int met = sc.nextInt();
            int koordinata = ko(lokacija[igralec], met, dolzinaPolja);
            lokacija [igralec] = koordinata;

            if (lastnistvo [koordinata] == -1 && denar[igralec] > cena) {
                kupi(igralec, koordinata, lastnistvo, denar, cena);
            }

            if (lastnistvo [koordinata] != -1 && lastnistvo[koordinata] != igralec) {
                int cenaP = racun(cena);
                int lastnik = lastnik(lokacija, igralec, lastnistvo);
                
                if (denar[igralec] >= cenaP){
                    placaj(igralec, lastnik, denar, cenaP);
                }

                else if (denar[igralec] < cenaP) {
                    bankrot(denar, igralec, stIgralci, lastnistvo);
                    stIgralci--;
                    if (stIgralci == 1)
                        break;
                }
            }

            
            igralec++;
            stMetov --;
            a = 0;
        }

     izpis(stIgralciOSN, lokacija, denar);
    }

    private static int [] polni (int [] tabela, int podatek) {
        for (int i = 0; i < tabela.length; i++)
            tabela [i] = podatek;
        return tabela;
    }

    private static void kupi (int igralec, int lokacija, int [] lastnistvo, int [] denar, int cena) {
        lastnistvo[lokacija] = igralec;
        denar [igralec] -= cena;
    }

    private static void placaj (int igralec, int lastnik, int [] denar, int cenaP) {
        denar [igralec] -= cenaP;
        denar [lastnik] += cenaP;
    }

    private static void bankrot (int [] denar, int igralec, int stIgralci, int [] lastnistvo) {
        denar[igralec] = -1;
        for (int i = 0; i < lastnistvo.length; i++){
            if (lastnistvo[i] == igralec)
                lastnistvo[i] = -1;
        }
    }

    private static int racun (int cena) {
        return 1;
    }

    private static int ko (int lokacija, int met, int dolzinaPolja) {
        for (int i = 0; i < met; i++) {
            lokacija ++;
            if (lokacija == dolzinaPolja)
                lokacija = 0;
        }
        return lokacija;
    }

    private static int lastnik (int [] lokacija, int igralec, int [] lastnistvo) {
        int x = lokacija [igralec];
        return lastnistvo [x];
    }

    private static void izpis (int stIgralciOSN, int [] lokacija, int [] denar) {
        for (int i = 0; i < stIgralciOSN; i++) {
            int cekin = denar [i];
            if (cekin == -1)
                System.out.println (lokacija [i] + " bankrot");
            else
                System.out.println (lokacija [i] + " " + denar [i]);
        }
    }
}
