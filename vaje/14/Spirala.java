
public class Spirala extends Krivulja {

    private double a;
    private int stObratov;

    public Spirala(double a, int stObratov) {
        this.a = a;
        this.stObratov = stObratov;
    }

    public int stObratov() {
        return this.stObratov;
    }

    public double radij(double t) {
        return this.a * t;
    }
}
