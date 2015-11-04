package hw2.task3;

/**
 * Created by Оксана on 01.11.2015.
 */
public class Car extends Vehicle {

    public Car(int price, int speed, int year) {
        super(price, speed, year);
    }
    public String toString() {
        return " Price " + super.getPrise() + " " + " Speed - " + super.getSpeed() + " " + " Year - " + super.getYear();
    }
}
