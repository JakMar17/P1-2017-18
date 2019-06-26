// _NE_ODSTRANI_

public class Test13 {

    public static void main(String[] args) {

        Krivulja krivulja = new Hipocikloida(0.88, 0.16, 10);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat13.png", "800x800"});
    }
}
