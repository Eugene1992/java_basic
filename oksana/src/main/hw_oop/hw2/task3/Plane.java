package hw2.task3;

/**
 * Created by Оксана on 01.11.2015.
 */
public class Plane extends Vehicle {
    private int passengers;
    private int hight;

    public Plane( int price, int speed,  int year,int passengers,int hight) {
        super(price, speed, year);
        this.passengers = passengers;
        this.hight = hight;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getHight() {
        return hight;
    }

    public void setPassengers(int newPassengers) {
        passengers = newPassengers;
    }

    public void setHight(int newHight) {
        hight = newHight;
    }
    public String toString() {
        return " Price - " + super.getPrise() + " " + " Speed - " + super.getSpeed() + " " + " Year - " + super.getYear() + " Passengers - " + getPassengers() + " Hight - " + getHight();
    }

}
