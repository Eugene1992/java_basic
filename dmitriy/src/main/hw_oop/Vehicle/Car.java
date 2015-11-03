package Vehicle;

public class Car extends Vehicle {

    public Car(String name, int price, int speed, int year) {
        super(name, price,speed, year);
    }
    public String toString() {
        return "Name - " + getName() + " " + " Price - " + getPrise() + " " + " Speed - " + getSpeed() + " " + " Year - " + getYear();
    }
}