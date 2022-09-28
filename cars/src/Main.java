import car.*;

class Main {
    public static void main(String[] args) {
        System.out.println(Car.MadeOf);

        Buldozer buldozer = new Buldozer();

        Porsche porsche = new Porsche("porsche 911 turbo", 1000000, 123);

        System.out.println(porsche.Name);

        System.out.println(porsche.GetVelocity());

        Lada lada = new Lada("lada kalina", 100000, 23);

        System.out.println(lada.Name);

        lada.Name = "lada galina";

        System.out.println(lada.Name);

        System.out.println(lada.GetPrice());

        lada.SetPrice(50000);

        System.out.println(lada.GetPrice());
    }
}
