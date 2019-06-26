
public class Trifolij extends Krivulja {

    private double a;

    public Trifolij(double a) {
        this.a = a;
    }

    public double radij(double t) {
        return this.a * Math.cos(t) * (4.0 * Math.sin(t) * Math.sin(t) - 1.0);
    }
}
