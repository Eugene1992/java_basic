package hw23;


public class main3 {

    public static void main5(String[] args) {
        Ship ship1 = new Ship(10, 15, 2000, 30, 2014, 5000, "Odessa");
        Ship ship2 = new Ship(15, 200, 3000, 35, 2015, 5000, "Batumy");
        Car car1 = new Car(15, 200, 1000, 35, 2009);
        Plane plane1 = new Plane(399, 200, 4000, 35, 2009, 10000, 30);

        System.out.println(ship1.toString());
        System.out.println(ship2.toString());

        System.out.println(car1.toString());
        System.out.println(plane1.toString());
    }
}
