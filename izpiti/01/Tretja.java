// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

import java.awt.*;

/*
 * TESTNI PRIMERI:
 *
 * J1, S1--S5: klici metod xTlorisa in yTlorisa
 *
 * J2, S6--S10: klici metode pikNaMeter
 *
 * J3--J4, S11--S20: samo navadne stene
 *
 * J5--J6, S21--S30: navadne stene + stene z odprtino
 *
 * J7--J8, S31--S40: navadne stene + stene z odprtino + stene z oknom
 *
 * J9--J10, S41--S50: stene vseh tipov
 */

public class Tretja extends Platno {

    public static void main(String[] args) {
        double wHise = 9.0;
        double hHise = 6.0;

        Stena[] stene = {
            // zunanja, vodoravna, zgoraj levo
            new StenaZOknom(true, 0.5, 0.0, 4.7, 0.5, Color.CYAN, 1.6),

            // zunanja, vodoravna, zgoraj desno
            new Stena(true, 5.2, 0.0, 3.3, 0.5),

            // zunanja, navpi"cna, levo
            new StenaZOdprtino(false, 0.0, 0.0, 6.0, 0.5, Color.RED, 2.0),

            // zunanja, navpi"cna, desno
            new StenaZOknom(false, 8.5, 0.0, 6.0, 0.5, Color.GREEN, 0.8),

            // zunanja, vodoravna, spodaj levo
            new StenaZVrati(true, 0.5, 5.5, 4.5, 0.5, Color.MAGENTA, 1.2, true),

            // zunanja, vodoravna, spodaj desno
            new Stena(true, 5.0, 5.5, 3.5, 0.5),

            // notranja, navpi"cna, zgoraj
            new Stena(false, 5.0, 0.5, 1.7, 0.2),

            // notranja, navpi"cna, spodaj
            new StenaZVrati(false, 5.0, 2.2, 3.3, 0.2, Color.BLUE, 0.6, true),

            // notranja, vodoravna
            new StenaZVrati(true, 5.2, 2.0, 3.3, 0.2, Color.YELLOW, 0.4, false),
        };

        Tretja tretja = new Tretja(wHise, hHise, stene);
        tretja.sproziRisanje(args);
    }

    //=========================================================================
    public static class Stena {

        private boolean vodoravna;  // true: vodoravna; false: navpi"cna
        private double x;
        private double y;
        private double dolzina;
        private double debelina;

        public Stena(boolean vodoravna, double x, double y, 
                     double dolzina, double debelina) {

            this.vodoravna = vodoravna;
            this.x = x;
            this.y = y;
            this.dolzina = dolzina;
            this.debelina = debelina;
        }

        public boolean jeVodoravna() { return this.vodoravna; }
        public double vrniX() { return this.x; }
        public double vrniY() { return this.y; }
        public double vrniDolzino() { return this.dolzina; }
        public double vrniDebelino() { return this.debelina; }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class StenaZOdprtino extends Stena {

        private Color barvaOdprtine;
        private double dolzinaOdprtine;

        public StenaZOdprtino(boolean vodoravna, double x, double y,
                              double dolzina, double debelina,
                              Color barvaOdprtine, double dolzinaOdprtine) {

            super(vodoravna, x, y, dolzina, debelina);
            this.barvaOdprtine = barvaOdprtine;
            this.dolzinaOdprtine = dolzinaOdprtine;
        }

        public Color vrniBarvoOdprtine() { return this.barvaOdprtine; }
        public double vrniDolzinoOdprtine() { return this.dolzinaOdprtine; }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class StenaZOknom extends StenaZOdprtino {

        public StenaZOknom(boolean vodoravna, double x, double y,
                           double dolzina, double debelina,
                           Color barvaOdprtine, double dolzinaOdprtine) {

            super(vodoravna, x, y, dolzina, debelina, barvaOdprtine, dolzinaOdprtine);
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class StenaZVrati extends StenaZOdprtino {

        // true: odpiranje na levo (gledano z levega oz.\ spodnjega konca stene)
        // false: odpiranje na desno (gledano z levega oz.\ spodnjega konca stene)
        private boolean smerOdpiranja;

        public StenaZVrati(boolean vodoravna, double x, double y,
                           double dolzina, double debelina,
                           Color barvaOdprtine, double dolzinaOdprtine,
                           boolean smerOdpiranja) {

            super(vodoravna, x, y, dolzina, debelina, barvaOdprtine, dolzinaOdprtine);
            this.smerOdpiranja = smerOdpiranja;
        }

        public boolean vrniSmerOdpiranja() { return this.smerOdpiranja; }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    private double wHise, hHise;
    private Stena[] stene;

    public Tretja(double wHise, double hHise, Stena[] stene) {
        this.wHise = wHise;
        this.hHise = hHise;
        this.stene = stene;
    }

    protected void narisi(Graphics2D g, double wp, double hp) {
        g.setColor(Color.GRAY);
        g.fillRect(ri(xTlorisa(wp,hp)),ri(yTlorisa(wp,hp)), ri(dolzinaHise(wp, hp)), ri(visinaHise (wp,hp)));
        double ena = xTlorisa(wp,hp) + 5;
        double dva = yTlorisa(wp,hp) + 5;
        double tri = dolzinaHise(wp, hp) - 10;
        double stiri = visinaHise (wp,hp) - 10;

        g.setColor(Color.white);
        g.fillRect(ri(ena), ri(dva), ri(tri), ri(stiri));
    }

    public double xTlorisa(double wp, double hp) {
        double dolzinaHise = wp * 0.8;
        return ((wp / 2.0) - (dolzinaHise / 2.0));
    }

    private double dolzinaHise (double wp, double hp) {
        return wp * 0.8;
    }

    private double visinaHise (double wp, double hp) {
        return hp * 0.8;
    }

    public double yTlorisa(double wp, double hp) {
        double dolzinaHise = hp * 0.8;
        return ((hp / 2) - (dolzinaHise / 2));
    }

    public double pikNaMeter(double wp, double hp) {
        double dolzinaHiseP = wp * 0.8;
        return dolzinaHiseP / wHise;
    }

    // po potrebi dopolnite ...
}
