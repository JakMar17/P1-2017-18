import java.util.*;
class DN01_63170196{
    public static void main (String [] args) {
        int v, s, p;
        int kriza = 0;
        
        Scanner sc = new Scanner (System.in);
        v = sc.nextInt();
        s = sc.nextInt();
        p = sc.nextInt();
        int stKorakov = p;

        int JakaX = 0;
        int JakaY = 0;
        int DarkoX = v-1;
        int DarkoY = s-1;
        int sRazdaljaJaka = 0;
        int sRazdaljaDarko = 0;

        while (stKorakov != 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int razdaljaJaka = razdalja (JakaX, JakaY, x, y);
            int razdaljaDarko = razdalja (DarkoX, DarkoY, x, y);
            if  (razdaljaDarko > razdaljaJaka) {
                JakaX = x;
                JakaY = y;
                sRazdaljaJaka = sRazdaljaJaka + razdaljaJaka;
            }
            /*else if (razdaljaDarko == razdaljaJaka) {
                if (kriza == 0) {
                    JakaX = x;
                    JakaY = y;
                    sRazdaljaJaka = sRazdaljaJaka + razdaljaJaka;
                    kriza++;
                }
                else {
                    DarkoX = x;
                    DarkoY = y;
                    sRazdaljaDarko = sRazdaljaDarko + razdaljaDarko;
                    kriza = 0;
                }
            }*/
            else {
                DarkoX = x;
                DarkoY = y;
                sRazdaljaDarko = sRazdaljaDarko + razdaljaDarko;
            }
            stKorakov--;
        }
        
        System.out.println(sRazdaljaJaka);
        System.out.println(sRazdaljaDarko);
    }

    private static int razdalja (int aX, int aY, int x, int y){
        int vrstica = 0;
        if (aX>x)
            vrstica = aX-x;
        else
            vrstica = x-aX;
        
        int stolpec = 0;
        if (aY>y)
            stolpec = aY-y;
        else
            stolpec = y-aY;

        return vrstica+stolpec;
    }
}