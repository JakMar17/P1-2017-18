// _NE_ODSTRANI_

public class Test03 {

    public static void main(String[] args) {

        Krivulja krivulja = new Srcnica(0.25);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat03.png", "800x600"});
    }
}
