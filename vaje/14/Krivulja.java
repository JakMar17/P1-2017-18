
public abstract class Krivulja {

    /** 
     * Vrne za"cetno vrednost parametra krivulje.
     */
    public double zacetnaVrednost() {
        return 0;
    }

    /**
     * Vrne "stevilo polnih krogov, ki jih opi"se parameter krivulje.
     */
    public int stObratov() {
        return 1;
    }

    /**
     * Vrne kon"cno vrednost parametra krivulje.
     */
    public double koncnaVrednost() {
        return (2 * Math.PI * this.stObratov());
    }

    /**
     * Vrne korak pove"cevanja parametra krivulje.
     */
    public double korak() {
        return 0.001;
    }

    /** 
     * Vrne oddaljenost to"cke krivulje od koordinatnega izhodi"s"ca za podano
     * vrednost parametra t.
     * @param t parameter krivulje
     */
    public double radij(double t) {
        return 0.0;
    }

    /**
     * Vrne koordinato x to"cke krivulje za podano vrednost parametra
     * krivulje.
     * @param t parameter krivulje
     */
    public double koordinataX(double t) {
        return this.radij(t) * Math.cos(t);
    }

    /**
     * Vrne koordinato y to"cke krivulje za podano vrednost parametra
     * krivulje.
     * @param t parameter krivulje
     */
    public double koordinataY(double t) {
        return this.radij(t) * Math.sin(t);
    }

}
