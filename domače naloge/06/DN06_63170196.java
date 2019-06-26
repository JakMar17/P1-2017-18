import java.util.*;

class DN06_63170196 {

    public static Scanner sc = new Scanner (System.in);

    public static void main (String [] args) {
        //zacetne spremenljivke
        int vrstice = sc.nextInt();
        int stolpci = sc.nextInt();
        int lokacije = sc.nextInt();
        int lokacija = 1;

        //tabela s koordinatami lokacij
        int [] [] tabela = new int [2] [lokacije];
        tabela = koordinate(vrstice, stolpci, lokacija, tabela);
        // System.out.println (tabela [0][0] + " " + tabela [1][0]);

        int skupaj = 0;
        while (lokacija != lokacije + 1) {
            int x = razdalja(tabela, lokacija);
            //System.out.println(x);
            skupaj += x;
            lokacija ++;

        }
        System.out.println(skupaj);
    }

    public static int [] [] koordinate (int vrstice, int stolpci, int lokacije, int [] [] tabela) {
        for (int i = 0; i < vrstice; i++) {
            for (int j = 0; j < stolpci; j++) {
                int x = sc.nextInt();
                 if (x != 0) {
                     tabela [0] [x-1] = i+1;
                     tabela [1] [x-1] = j+1;
                 }
            }
        }

        return tabela;
    }

    public static int razdalja (int [] [] tabela, int lokacija) {
        
        if (lokacija == 1) {
            int x = tabela [0] [0];
            int y = tabela [1] [0];
            //System.out.print(x + " " + y);
            return x + y - 2;
        }
        
        int lokacija1 = lokacija - 2;
        int lokacija2 = lokacija  -1;
        int razdaljax, razdaljay, razdalja;
        
        int x1 = tabela [0] [lokacija1];
        int y1 = tabela [1] [lokacija1];

        int x2 = tabela [0] [lokacija2];
        int y2 = tabela [1] [lokacija2];

        //System.out.println(x1 + " " + y1);
        //System.out.println(x2 + " " + y2);

        if (x1 > x2) {
            razdaljax = x1 - x2;
            //System.out.print(razdaljax);
        }
        else {
            razdaljax = x2 - x1;
            //System.out.print(razdaljax);
        }
            
        if (y1 > y2) {
            razdaljay = y1 - y2;
            //System.out.print(razdaljay);
        }
        else {
            razdaljay = y2 - y1;
            //System.out.print(razdaljay);
        }


        razdalja = razdaljax + razdaljay;
        return razdalja ;

    }


    //pomožne tabele za testiranje:
    //beriTabelo: prebere tabelo iz podanih podatkov

    public static int [] [] beriTabelo (int vrstice, int stolpci, int lokacije) {
        int [] [] tabela = new int [vrstice] [stolpci];
        
        tabela [0] [0] = 0;
        tabela [1] [0] = 0;

        for (int i = 1; i < vrstice; i++) {
            for (int j = 1; j < stolpci; j++) {
                tabela [i] [j] = sc.nextInt();
            }
        }

        return tabela;
    }
    public static void izpisiTabelo (int [] [] kopija, int vrstice, int stolpci) {
        for (int i = 0; i < vrstice; i++) {
            for (int j = 0; j < stolpci; j++) {
                System.out.print (kopija [i] [j] + " ");
            }
            System.out.println();
        }
    }
}