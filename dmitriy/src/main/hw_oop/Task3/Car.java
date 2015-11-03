package Task3;

public class Car extends Vehicle {

    private String name;
    private int price;
    private int speed;
    private int year;

    public String getName(){return name;}
    public int getPrise() {return price;}
    public int getSpeed() {return speed;}
    public int getYear() {return year;}

    public void setName(String newName){name = newName;}
    public void setPrice(int newPrice){price = newPrice;}
    public void setSpeed(int newSpeed){speed = newSpeed;}
    public void setYear(int newYear){year = newYear;}

    public Car(String name, int price, int speed, int year) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    public String toString() {
        return "Name - " + name + " " + " Price - " + price + " " + " Speed - " + speed + " " + " Year - " + year;
    }

}