
import java.util.Scanner;

public class VrstaZbor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stVojakov = sc.nextInt();

        // preberi višine vojakov
        int[] visine = new int[stVojakov];
        for (int i = 0;  i < stVojakov;  i++) {
            visine[i] = sc.nextInt();
        }
    }
}
