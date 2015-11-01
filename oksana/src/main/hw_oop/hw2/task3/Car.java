package hw2.task3;

/**
 * Created by Оксана on 01.11.2015.
 */
public class Car {
    public static void main(String[] args) {


        Vehicle car = new Vehicle();
        car.setPrice(10098);
        car.setSpeed(200);
        car.setYear(2005);
        car.getPrice();
        car.getYear();
        car.getSpeed();
        System.out.println(car.getPrice()+" "+car.getSpeed()+" "+car.getYear());

    }
}
