// _NE_ODSTRANI_

public class Test05 {

    public static void main(String[] args) {

        Krivulja krivulja = new Spirala(0.05, 2);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat05.png", "800x800"});
    }
}
