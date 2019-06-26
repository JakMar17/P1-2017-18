import java.util.*;

class DN09_63170196 {
    public static Scanner sc = new Scanner(System.in);
    protected static String naslovnik;
    private static int stevec;

    private static int kazalec = 0;
    private static String[][] literatura;

    public static void main(String[] args) {
        inicializacija();

        while (stevec > 0) {
            ukaz();
            stevec--;
        }
        izpis();
    }

    private static void inicializacija() {
        naslovnik = sc.next();
        stevec = sc.nextInt();
        literatura = new String[stevec][3];
    }

    private static void ukaz() {
        String ukaz = sc.next();

        switch (ukaz) {
        case "referat":
            referat();
            break;
        case "clanek":
            clanek();
            break;
        case "monografija":
            monografija();
            break;
        }
    }

    private static void referat() {
        String naziv = "";
        int stAvtorjev = sc.nextInt();
        int indexAvtorja = 0;
        for (int i = 0; i < stAvtorjev; i++) {
            String temp = sc.next();
            if (temp.equals("#")) {
                naziv += naslovnik;
                indexAvtorja = i;
            } else
                naziv += temp;

            if (i == stAvtorjev - 1)
                naziv += ": ";
            else
                naziv += ", ";
        }

        naziv += (sc.next() + ". "); //naslov
        naziv += (sc.next() + ": "); //konferenca

        String temp = sc.next();
        boolean mednarodna = true;
        if (temp.equals("false"))
            mednarodna = false;

        int zStran = sc.nextInt();
        int kStran = sc.nextInt();

        naziv += (zStran + "-" + kStran + "");

        double tocke = tockeRefereat(mednarodna, stAvtorjev);
        String zTocke = zapisTockReferat(stAvtorjev, mednarodna);
        zapis(naziv, tocke, zTocke);
    }

    private static double tockeRefereat(boolean mednarodna, int stAvtorjev) {
        if (mednarodna)
            return (3.0 / stAvtorjev);
        else
            return (1.0 / stAvtorjev);
    }

    private static String zapisTockReferat(int stAvtorjev, boolean mednarodna) {
        int osnova;

        if (mednarodna)
            osnova = 3;
        else
            osnova = 1;

        int tPolne = osnova / stAvtorjev;
        int ostanek = osnova - (tPolne * stAvtorjev);

        int gcd = gcd(stAvtorjev, ostanek);

        if (ostanek == 0)
            return tPolne + "";

        else {
            ostanek /= gcd;
            stAvtorjev /= gcd;
            return (tPolne + "+" + ostanek + "/" + stAvtorjev);
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int ostanek = a % b;
            a = b;
            b = ostanek;
        }
        return a;
    }

    private static void clanek() {
        String naziv = "";
        int stAvtorjev = sc.nextInt();
        int indexAvtorja = 0;
        for (int i = 0; i < stAvtorjev; i++) {
            String temp = sc.next();
            if (temp.equals("#")) {
                naziv += naslovnik;
                indexAvtorja = i;
            } else
                naziv += temp;

            if (i == stAvtorjev - 1)
                naziv += ": ";
            else
                naziv += ", ";
        }

        naziv += (sc.next() + ". "); //naslov
        naziv += (sc.next() + " "); //revija

        int letnik = sc.nextInt();
        int stevilka = sc.nextInt();
        int leto = sc.nextInt();
        naziv += (letnik + "(" + stevilka + "): ");

        double pomembnost = sc.nextDouble() * 1.0;
        double pDolzina = sc.nextInt() * 1.0;

        int zStran = sc.nextInt();
        int kStran = sc.nextInt();
        naziv += (zStran + "-" + kStran + " (" + leto + ")");
        double tocke = tockeClanek(pomembnost, pDolzina, stAvtorjev);
        String zTock = zapisTockClanek(stAvtorjev, pomembnost, pDolzina);
        zapis(naziv, tocke, zTock);

    }

    private static double tockeClanek(double pomembnost, double pDolzina, int stAvtorjev) {
        double osnova;

        if ((pomembnost / pDolzina) <= 0.25)
            osnova = 10;
        else if ((pomembnost / pDolzina) <= 0.50)
            osnova = 8;
        else if ((pomembnost / pDolzina) <= 0.75)
            osnova = 6;
        else if (pomembnost == pDolzina + 1)
            osnova = 2;
        else
            osnova = 4;

        //izpisTest((osnova/stAvtorjev*1.0)+"");
        return (osnova / stAvtorjev * 1.0);

    }

    private static String zapisTockClanek(int stAvtorjev, double pomembnost, double pDolzina) {
        int osnova;

        if ((pomembnost / pDolzina) <= 0.25)
            osnova = 10;
        else if ((pomembnost / pDolzina) <= 0.50)
            osnova = 8;
        else if ((pomembnost / pDolzina) <= 0.75)
            osnova = 6;
        else if (pomembnost == pDolzina + 1)
            osnova = 2;
        else
            osnova = 4;

        int tPolne = osnova / stAvtorjev;
        int ostanek = osnova - (tPolne * stAvtorjev);

        int gcd = gcd(stAvtorjev, ostanek);

        if (ostanek == 0)
            return tPolne + "";

        else {
            ostanek /= gcd;
            stAvtorjev /= gcd;
            return (tPolne + "+" + ostanek + "/" + stAvtorjev);
        }
    }

    private static void monografija() {
        String naziv = "";
        int stAvtorjev = sc.nextInt();
        int indexAvtorja = 0;
        for (int i = 0; i < stAvtorjev; i++) {
            String temp = sc.next();
            if (temp.equals("#")) {
                naziv += naslovnik;
                indexAvtorja = i;
            } else
                naziv += temp;

            if (i == stAvtorjev - 1)
                naziv += ":";
            else
                naziv += ",";
            naziv += " ";
        }

        naziv += (sc.next() + ". "); //naslov
        naziv += (sc.next() + " "); //zalozba

        int letnik = sc.nextInt();
        naziv += (letnik + ", ISBN " + sc.next());

        double tocke = tockeMonografija(stAvtorjev);
        String zTock;
        if (stAvtorjev == 1)
            zTock = 10 + "";
        else
            zTock = zapisTockMonografija(stAvtorjev);
        zapis(naziv, tocke, zTock);

    }

    private static double tockeMonografija(int stAvtorjev) {
        return (10.0 / stAvtorjev);
    }

    private static String zapisTockMonografija(int stAvtorjev) {

        int osnova = 10;
        int tPolne = osnova / stAvtorjev;
        int ostanek = osnova - (tPolne * stAvtorjev);

        int gcd = gcd(stAvtorjev, ostanek);

        if (ostanek == 0)
            return tPolne + "";

        else {
            ostanek /= gcd;
            stAvtorjev /= gcd;
            return (tPolne + "+" + ostanek + "/" + stAvtorjev);
        }
    }

    private static void zapis(String naziv, double tocke, String zTock) {
        literatura[kazalec][0] = naziv;
        literatura[kazalec][1] = String.valueOf(tocke);
        literatura[kazalec][2] = zTock;
        kazalec++;
    }

    private static void izpis() {
        int x = kazalec;
        while (x != 0) {
            double max = 0.0;
            int koordinata = 0;
            for (int i = 0; i < kazalec; i++) {
                double temp = Double.parseDouble(literatura[i][1]);
                if (temp > max) {
                    max = temp;
                    koordinata = i;
                }
            }
            System.out.println(literatura[koordinata][0] + " | " + literatura[koordinata][2]);
            literatura[koordinata][1] = 0 + "";
            x--;
        }

    }

    private static void izpisTest(String naziv) {
        System.out.println(naziv);
    }
}