import java.util.*;

class DN03_63170196 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    long prastevilo = sc.nextLong();
    long k = sc.nextLong();

    long potenca = kNaPrastevilo(prastevilo, k);
    long fakulteta = 1;
    long st = 1;


    while ((fakulteta % potenca) != 0) {
      st++;
      fakulteta = fakulteta (st, fakulteta);
    }

    System.out.println (st);

  }
  public static long kNaPrastevilo (long prastevilo, long k) {
    long potenca = 1;
    while (k != 0) {
      potenca *= prastevilo;
      k--;
    }
    return potenca;
  }

  public static long fakulteta (long st, long fakulteta) {
    return fakulteta *= st;
    //return fakulteta;
  }
}
