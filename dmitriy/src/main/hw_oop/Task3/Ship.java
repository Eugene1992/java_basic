package Task3;

public class Ship extends Vehicle{

    private String name;
    private int price;
    private int speed;
    private int year;
    private int passengers;
    private String port;

    public int getPassengers(){return passengers;}
    public String getPort(){return port;}

    public void setPassengers(int newPassengers){passengers = newPassengers;}
    public void setPort(String newPort){port = newPort;}

    public Ship(String name,int price, int speed, int year,int passengers, String port) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.passengers = passengers;
        this.port = port;
    }
    public String toString() {
        return "Name - " + name + " " + " Price - " + price + " " + " Speed - " + speed + " " + " Year - " + year + " Passengers - " + passengers + " Port - " + port;
    }

}
