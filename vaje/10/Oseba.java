
public class Oseba {

    // dopolnite ...

    /**
     * Ustvari nov objekt razreda Oseba.
     */
    public Oseba(String ip, int starost, PostniNaslov postniNaslov) {
        // dopolnite ...
    }

    /**
     * Vrne ime in priimek osebe `this'.
     */
    public String vrniIP() {
        // popravite / dopolnite ...
        return "";
    }

    /**
     * Vrne niz z osnovnimi podatki o osebi `this'.
     */
    public String toString() {
        // popravite / dopolnite ...
        return "";
    }

    /**
     * Vrne število prijateljev osebe `this'.
     */
    public int steviloPrijateljev() {
        // popravite / dopolnite ...
        return -1;
    }

    /**
     * Vrne `true' natanko v primeru, če je oseba `this' prijatelj osebe `os'.
     */
    public boolean jePrijateljOd(Oseba os) {
        // popravite / dopolnite ...
        return false;
    }

    /**
     * Če sta osebi `prva' in `druga' različni in če še nista prijatelja, to
     * postaneta, sicer pa se ne zgodi nič.
     */
    public static boolean vzpostaviPrijateljstvo(Oseba prva, Oseba druga) {
        // popravite / dopolnite ...
        return false;
    }

    /**
     * Vrne `true' natanko v primeru, če oseba `os' prebiva na istem poštnem
     * naslovu kot oseba `this'.
     */
    public boolean naIstemNaslovuKot(Oseba os) {
        // popravite / dopolnite ...
        return false;
    }

    /**
     * Vrne število prijateljev osebe `this', ki živijo na istem poštnem
     * naslovu kot oseba `this'.
     */
    public int steviloPrijateljevNaIstemNaslovu() {
        // popravite / dopolnite ...
        return -1;
    }

    /**
     * Vrne najstarejšega prijatelja osebe `this' (prvega, če jih je več;
     * null, če jih ni).
     */
    public Oseba najstarejsiPrijatelj() {
        // popravite / dopolnite ...
        return null;
    }
}
