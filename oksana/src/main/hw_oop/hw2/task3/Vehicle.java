package hw2.task3;

/**
 * Created by Оксана on 01.11.2015.
 */
public class Vehicle {

    private int price;
    private int speed;
    public int year;

    public Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    public int getPrise() {
        return price;
    }
    public void setPrice(int newPrice){
        price = newPrice;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int newYear){
        year = newYear;
    }




}
