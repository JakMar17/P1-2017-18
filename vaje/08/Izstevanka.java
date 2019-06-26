
import java.util.Scanner;

public class Izstevanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        // preberi imena otrok
        String[] otroci = new String[stOtrok];
        for (int i = 0;  i < stOtrok;  i++) {
            otroci[i] = sc.next();
        }
    }
}
