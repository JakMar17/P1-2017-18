// _NE_ODSTRANI_

public class Test11 {

    public static void main(String[] args) {

        Krivulja krivulja = new Hipocikloida(0.75, 0.25, 1);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat11.png", "800x600"});
    }
}
