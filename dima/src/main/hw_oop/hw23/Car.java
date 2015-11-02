package hw23;

/**
 * Created by IT on 02.11.2015.
 */
public class Car extends Vehicle {

    @Override
    public String toString() {

        return "x="+getX()+", y= "+ getY()+ ", Price=" + getPrice()+ ", Speed=" +getSpeed()+ ", Yer=" + getYer();
    }
}
