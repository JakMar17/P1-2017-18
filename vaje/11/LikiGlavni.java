
import java.util.Scanner;

public class LikiGlavni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lik[] liki = preberiLike(sc);

        int ukaz = sc.nextInt();
        switch (ukaz) {
            case 1:
                izpisiPodatke(liki);
                break;

            case 2:
                Lik najLik = likZNajvecjoPloscino(liki);
                System.out.println(najLik.toString());
                break;

            case 3:
                pravokotnikiInKvadrati(liki);
                break;
        }
    }

    /** Prebere podatke o vseh likih z vhoda in vrne tabelo s prebranimi
     * podatki. */
    private static Lik[] preberiLike(Scanner sc) {
        int stLikov = sc.nextInt();

        Lik[] liki = new Lik[stLikov];
        for (int i = 0;  i < liki.length;  i++) {
            int vrsta = sc.nextInt();
            switch (vrsta) {
                case 1:
                    liki[i] = new Pravokotnik(sc.nextInt(), sc.nextInt());
                    break;

                case 2:
                    liki[i] = new Kvadrat(sc.nextInt());
                    break;

                case 3:
                    liki[i] = new Krog(sc.nextInt());
                    break;
            }
        }
        return liki;
    }

    /** Izpi"se podatke o vseh likih. */
    private static void izpisiPodatke(Lik[] liki) {
        // ...
    }

    /** Vrne lik z najve"cjo plo"s"cino v podani tabeli. */
    private static Lik likZNajvecjoPloscino(Lik[] liki) {
        // ...
        return null;
    }

    /** Izpi"se podatke o vseh pravokotnikih in kvadratih v podani tabeli. */
    private static void pravokotnikiInKvadrati(Lik[] liki) {
        // ...
    }
}
