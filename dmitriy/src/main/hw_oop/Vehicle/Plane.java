package Vehicle;

public class Plane extends Vehicle{
    private String name;
    private int price;
    private int speed;
    private int year;
    private int height;
    private int passengers;

    public int getHeight(){return height;}
    public int getPassengers(){return passengers;}

    public void setHeight(int newHeight){height = newHeight;}
    public void setPassengers(int newPassengers){passengers = newPassengers;}

    public Plane(String name, int price, int speed, int year, int height, int passengers) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.passengers = passengers;
    }
    public String toString() {
        return "Name - " + name + " " + " Price - " + price + " " + " Speed - " + speed + " " + " Year - " + year + " Height - " + height + " Passengers - " + passengers;
    }
}
