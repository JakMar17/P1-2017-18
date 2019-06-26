import java.util.*;

class DN00_63170196{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int b = sc.nextInt();
        int p = 0;
        while (p == 0)
            p = sc.nextInt();
        System.out.println(b/p);
        System.out.println(b%p);
    }
}