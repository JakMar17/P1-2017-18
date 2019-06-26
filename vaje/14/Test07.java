// _NE_ODSTRANI_

public class Test07 {

    public static void main(String[] args) {

        Krivulja krivulja = new Epicikloida(0.45, 0.15, 1);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat07.png", "800x600"});
    }
}
