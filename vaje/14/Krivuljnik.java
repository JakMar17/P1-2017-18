
import java.awt.*;

public class Krivuljnik extends Platno {

    public static void main(String[] args) {
        // V odvisnosti od argumentov ukazne vrstice bodisi ustvari okno in
        // plo"s"co ali pa pripravi sliko v pomnilniku, na katero je mo"zno
        // risati.  S stali"s"ca izdelave na"sega programa je to popolnoma
        // vseeno.

        Krivulja krivulja = new Srcnica(0.25);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(args, "Krivulje");
    }

    private Krivulja krivulja;

    public Krivuljnik(Krivulja krivulja) {
        this.krivulja = krivulja;
    }

    /**
     * Nari"se sliko na platno (zaslon ali slikovno datoteko).  To metodo
     * pokli"ce ogrodje, ko je "cas zanjo.
     * @param g objekt, ki nam omogo"ca risanje
     * @param wp "sirina platna
     * @param hp vi"sina platna
     */
    protected void narisi(Graphics2D g, double wp, double hp) {
        // dopolnite ...
    }

    /**
     * Vrne koordinato x v koordinatnem sistemu platna, ki ustreza podani
     * koordinati x v koordinatnem sistemu krivulje.
     * @param mx koordinata x v koordinatnem sistemu krivulje
     * @param wp "sirina platna
     * @param hp vi"sina platna
     */
    public static double xMatVZaslon(double mx, double wp, double hp) {
        // popravite / dopolnite ...
        return -1.0;
    }

    /**
     * Vrne koordinato y v koordinatnem sistemu platna, ki ustreza podani
     * koordinati y v koordinatnem sistemu krivulje.
     * @param my koordinata y v koordinatnem sistemu krivulje
     * @param wp "sirina platna
     * @param hp vi"sina platna
     */
    public static double yMatVZaslon(double my, double wp, double hp) {
        // popravite / dopolnite ...
        return -1.0;
    }
}
