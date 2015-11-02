package hw23;

/**
 * Created by IT on 02.11.2015.
 */
public class Plane extends Vehicle {
    private int height;
    private int quantity;

    public Plane(int x, int y, float price, int speed, int yer, int height, int quantity) {
        super(x, y, price, speed, yer);
        this.height = height;
        this.quantity = quantity;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "x="+getX()+", y= "+ getY()+ ", Price=" + getPrice()+ ", Speed=" +getSpeed()+ ", Yer=" + getYer() + ", Height=" + getHeight()+ ", Quantity=" + getQuantity();
    }
}
