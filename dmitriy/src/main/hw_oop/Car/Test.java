package Car;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car(1988);
        Car car2 = new Car(2014, "Red");

        System.out.println("Car1 - " + car1.getYear() + " " + car1.getColor());
        System.out.println("Car2 - " + car2.getYear() + " " + car2.getColor());
    }
}
