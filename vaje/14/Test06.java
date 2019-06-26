// _NE_ODSTRANI_

public class Test06 {

    public static void main(String[] args) {

        Krivulja krivulja = new Spirala(0.015, 10);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat06.png", "600x600"});
    }
}
