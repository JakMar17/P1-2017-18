
public class PostniNaslov {

    private String ulicaHS;  // ulica s hišno številko
    private int postnaStevilka;
    private String posta;

    /**
     * Ustvari nov objekt razreda PostniNaslov.
     */
    public PostniNaslov(String ulicaHS, int postnaStevilka, String posta) {
        this.ulicaHS = ulicaHS;
        this.postnaStevilka = postnaStevilka;
        this.posta = posta;
    }

    /** 
     * Vrne predstavitev poštnega naslova `this' v obliki niza.
     */
    public String toString() {
        // popravite / dopolnite ...
        return "";
    }

    /** 
     * Vrne `true' natanko v primeru, če objekt `pn' predstavlja isti poštni
     * naslov kot objekt `this'.
     */
    public boolean jeEnakKot(PostniNaslov pn) {
        // popravite / dopolnite ...
        return false;
    }
}
