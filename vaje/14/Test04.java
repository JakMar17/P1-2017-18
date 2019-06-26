// _NE_ODSTRANI_

public class Test04 {

    public static void main(String[] args) {

        Krivulja krivulja = new Trifolij(0.9);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat04.png", "600x800"});
    }
}
