// _NE_ODSTRANI_

public class Test08 {

    public static void main(String[] args) {

        Krivulja krivulja = new Epicikloida(0.57, 0.15, 10);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat08.png", "600x800"});
    }
}
