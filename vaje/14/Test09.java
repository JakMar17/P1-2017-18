// _NE_ODSTRANI_

public class Test09 {

    public static void main(String[] args) {

        Krivulja krivulja = new Epicikloida(0.55, 0.10, 10);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat09.png", "800x800"});
    }
}
