package hw23;

/**
 * Created by IT on 02.11.2015.
 */
public class Car extends Vehicle {

    public Car(int x, int y, float price, int speed, int yer) {
        super(x, y, price, speed, yer);
    }

    @Override
    public String toString() {

        return "x="+getX()+", y= "+ getY()+ ", Price=" + getPrice()+ ", Speed=" +getSpeed()+ ", Yer=" + getYer();
    }
}
