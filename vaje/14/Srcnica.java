
public class Srcnica extends Krivulja {

    private double a;

    public Srcnica(double a) {
        this.a = a;
    }

    public double radij(double t) {
        return 2.0 * this.a * (1.0 + Math.cos(t));
    }
}
