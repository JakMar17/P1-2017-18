// _NE_ODSTRANI_

public class Test10 {

    public static void main(String[] args) {

        Krivulja krivulja = new Epicikloida(0.42, 0.20, 10);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat10.png", "600x600"});
    }
}
