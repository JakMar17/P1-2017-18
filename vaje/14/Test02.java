
public class Test02 {

    public static void main(String[] args) {

        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(1.0, 500, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(1.0, 700, 500)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(1.0, 700, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(1.0, 500, 500)));
        System.out.println("---");

        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.4, 500, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.4, 700, 500)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.4, 700, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.4, 500, 500)));
        System.out.println("---");

        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.0, 500, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.0, 700, 500)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.0, 700, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(0.0, 500, 500)));
        System.out.println("---");

        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-0.7, 500, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-0.7, 700, 500)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-0.7, 700, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-0.7, 500, 500)));
        System.out.println("---");

        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-1.0, 500, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-1.0, 700, 500)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-1.0, 700, 700)));
        System.out.println(Platno.ri(Krivuljnik.yMatVZaslon(-1.0, 500, 500)));
    }
}
