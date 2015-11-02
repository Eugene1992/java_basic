package hw23;

/**
 * Created by IT on 02.11.2015.
 */
public class Plane extends Vehicle {
    private int height;
    private int quantity;

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
