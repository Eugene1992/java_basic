package Vehicle;

public class Plane extends Vehicle{

    private int height;
    private int passengers;

    public Plane(String name, int price, int speed, int year, int height, int passengers) {
        super(name, price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }
        public int getHeight(){return height;}
        public int getPassengers(){return passengers;}

        public void setHeight(int newHeight){height = newHeight;}
        public void setPassengers(int newPassengers){passengers = newPassengers;}

    public String toString() {
        return "Name - " + getName() + " " + " Price - " + getPrise() + " " + " Speed - " + getSpeed() + " " + " Year - " + getYear() + " Height - " + getHeight() + " Passengers - " + getPassengers();
    }
}
