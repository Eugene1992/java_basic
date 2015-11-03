package Vehicle;

public class Vehicle {

    private String name;
    private int price;
    private int speed;
    private int year;

    public Vehicle(String name, int price, int speed, int year) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
        public String getName(){return name;}
        public int getPrise() {return price;}
        public int getSpeed() {return speed;}
        public int getYear() {return year;}

        public void setName(String newName){name = newName;}
        public void setPrice(int newPrice){price = newPrice;}
        public void setSpeed(int newSpeed){speed = newSpeed;}
        public void setYear(int newYear){year = newYear;}
}


