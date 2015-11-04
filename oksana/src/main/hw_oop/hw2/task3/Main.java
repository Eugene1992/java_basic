package hw2.task3;

/**
 * Created by Оксана on 04.11.2015.
 */
public class Main {
    public static void main(String[] Args) {

        Vehicle car = new Car(12, 1414, 15453);
        Plane plane = new Plane(12, 14, 14, 145, 12);
        Ship ship = new Ship(12, 13, 14, 23, "Port");

        Vehicle vehicle[] = new Vehicle[3];

        vehicle[0] = car;
        vehicle[1] = plane;
        vehicle[2] = ship;

        for (Vehicle arr : vehicle) {
            System.out.println(arr.toString());
        }
    }
}
