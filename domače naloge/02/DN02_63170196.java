import java.util.*;

public class DN02_63170196 {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);
        int število = sc.nextInt();
        int ukaz = sc.nextInt();

        switch (ukaz) {
            case 1:
                System.out.println(manjše(sc, število));
                break;
            case 2:
                System.out.println(zadnjaStevka(sc, število));
                break;
            case 3:
                System.out.println(prvaStevka(sc, število));
                break;
            case 4:
                System.out.println(permutacije(sc, število));
                break;
        }
    }

    public static int manjše (Scanner sc, int število) {
        int odštevalnik = število;
        int seštevalnik = 0;
        while (odštevalnik != 0) {
            int a =sc.nextInt();
            int b = sc.nextInt();
            if (a < b)
                seštevalnik++;
            odštevalnik--;
        }
        return seštevalnik;
    }

    public static int zadnjaStevka (Scanner sc, int število) {
        int odštevalnik = število;
        int seštevalnik = 0;
        while (odštevalnik != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ( (a % 10) == (b % 10) )
                seštevalnik++;
            odštevalnik--;
        }
        return seštevalnik;
    }

    public static int prvaStevka (Scanner sc, int število) {
        int odštevalnik = število;
        int seštevalnik = 0;
        while (odštevalnik != 0) {
            int a = sc.nextInt();
            int cifraA = 0;
            while (a != 0) {
                cifraA = a % 10;
                a /= 10;
            }
            int b = sc.nextInt();
            int cifraB = 0;
            while (b != 0) {
                cifraB = b % 10;
                b /= 10;
            }
            if ( cifraA == cifraB )
                seštevalnik++;
            odštevalnik--;
        }
        return seštevalnik;
    }

    public static int permutacije (Scanner sc, int število) {
      int seštevalnik = 0;
      int odštevalnik = število;

      while (odštevalnik != 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        int kopijaA = a;
        int kopijaB, števkaA, števkaB;
        int dolzinaA = dolzinaStevila (a);
        int dolzinaB = dolzinaStevila (b);
        if (dolzinaA != dolzinaB) {
          odštevalnik --;
          continue;
        }

        if (sestevekCifer(a, dolzinaA) != sestevekCifer(b, dolzinaB) ) {
          odštevalnik --;
          continue;
        }
        int dA =dolzinaStevila(a);
        zanka: while (dA != 0) {
          kopijaB = b;
          števkaA = kopijaA % 10;
          int dB = dolzinaStevila(b);
          notranjaZanka: while (dB != 0) {
            x = 0;
            števkaB = kopijaB % 10;
            if (števkaA == števkaB) {
              x = 1;
              break notranjaZanka;
            }
            kopijaB /= 10;
            dB--;
          }
          if (x != 1)
            break zanka;
          kopijaA /= 10;
          dA --;
        }
        if (x == 1)
          seštevalnik++;
          odštevalnik--;
      }
      return seštevalnik;
    }

    public static int dolzinaStevila (int število) {
      int x = število;
      int dolžina = 0;
      while (x != 0) {
        x /= 10;
        dolžina++;
      }
      return dolžina;
    }

    public static int sestevekCifer (int stevilo, int dolzina) {
      int vsota = 0;
       while (dolzina !=0) {
        vsota += (stevilo%10);
        stevilo /= 10;
        dolzina--;
      }
      return vsota;
    }

    /*public static int gremoNaMorje (int stevilo) {
      int x = stevilo;
      int potenca = 1;
      while (x != 0) {
        potenca *= 10;
        x /= 10;
      }
    }*/

    /*public static int permutacije (Scanner sc, int število) {
      int odštevalnik = število;
      while (odštevalnik > 0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (dolzinaStevila(a) != dolzinaStevila(b)) {
          odštevalnik--;
          continue;
        }
        if (sestevekCifer(a) != sestevekCifer(b)) {
          odštevalnik--;
          continue;
        }
        int prva = a;
        zanka1: while(prva > 0) {
          int druga = b;
          int stevka1 = prva % 10;

          zanka2: while (druga > 0)
        }
      }
    }*/
}
