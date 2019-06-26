
public class Epicikloida extends Krivulja {

    private double a;
    private double b;
    private int stObratov;

    public Epicikloida(double a, double b, int stObratov) {
        this.a = a;
        this.b = b;
        this.stObratov = stObratov;
    }

    public int stObratov() {
        return this.stObratov;
    }

    public double koordinataX(double t) {
        return (this.a + this.b) * Math.cos(t) - this.b * Math.cos((this.a / this.b + 1.0) * t);
    }

    public double koordinataY(double t) {
        return (this.a + this.b) * Math.sin(t) - this.b * Math.sin((this.a / this.b + 1.0) * t);
    }
}
