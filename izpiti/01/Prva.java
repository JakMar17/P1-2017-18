
// 63170196
// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

public class Prva {

    public static void main(String[] args) {
    }

    //=========================================================================
    // V vseh testnih primerih velja t.length >= 2, t.length <= 1000 in d >= 1.
    //
    // V primerih J1--J2 in S1--S10 tabela t vsebuje natanko en element z
    // iskano lastnostjo.
    //=========================================================================

    public static int zadnjiDeljiviPar(int[] t, int d) {
        boolean deljiv = false;
        int par = -1;
        for (int i = 0; i < t.length; i++) {
            boolean temp = (t[i] % d == 0);

            if (temp & deljiv) {
                par = i;
            }
            else if (!temp && deljiv) {
                deljiv = false;
            }
            else if (temp && !deljiv) {
                deljiv = true;
            }

        }
        return par;
    }

    //=========================================================================
    // V vseh testnih primerih velja n >= 1.
    //
    // V primerih J6--J7 in S26--S35 "stevilo n vsebuje natanko eno ni"clo.
    //=========================================================================

    public static long odstraniNicle(long n) {
        long dolzina = dolzina(n);
        long x = n;
        long novo = 0;
        while (dolzina != 0) {
            //dobi cifro
            long temp = x;
            long stevka = 0;
            for (int i = 0; i < dolzina; i++) {
                stevka = temp % 10;
                temp /= 10;
            }


            if (stevka == 0) {
                dolzina --;
                continue;
            }

            dolzina --;
            novo = novo * 10 +stevka;
        }
        return novo;
    }

    private static long dolzina (long n) {
        long x = n;
        long dolzina = 0;
        while (x != 0) {
            dolzina ++;
            x /= 10;
        }
        return dolzina;
    }

}
