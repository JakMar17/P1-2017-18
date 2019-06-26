// _NE_ODSTRANI_

public class Test14 {

    public static void main(String[] args) {

        Krivulja krivulja = new Hipocikloida(0.84, 0.40, 10);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat14.png", "600x600"});
    }
}
