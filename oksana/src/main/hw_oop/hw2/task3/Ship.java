package hw2.task3;

/**
 * Created by Оксана on 01.11.2015.
 */
public class Ship extends Vehicle {
    private int passengers;
    private String port;

    public Ship( int price, int speed,  int year,int passengers,String port) {
        super(price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }


    public int getPassengers() {
        return passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPassengers(int newPassengers) {

        passengers = newPassengers;
    }

    public void setPort(String newPort) {
        port = newPort;

    }

    public String toString() {
        return " Price - " + super.getPrise() + " " + " Speed - " + super.getSpeed() + " " + " Year - " + super.getYear() + " Passengers - " + getPassengers() + " Port - " + getPort();
    }


}


