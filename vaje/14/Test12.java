// _NE_ODSTRANI_

public class Test12 {

    public static void main(String[] args) {

        Krivulja krivulja = new Hipocikloida(0.76, 0.20, 10);
        Krivuljnik krivuljnik = new Krivuljnik(krivulja);
        krivuljnik.sproziRisanje(new String[]{"rezultat12.png", "600x800"});
    }
}
