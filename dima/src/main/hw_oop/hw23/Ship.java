package hw23;

/**
 * Created by IT on 02.11.2015.
 */
public class Ship extends Vehicle {
    private int quantity;
    private String port;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "x="+getX()+", y= "+ getY()+ ", Price=" + getPrice()+ ", Speed=" +getSpeed()+ ", Yer=" + getYer() + ", Port=" + getPort()+ ", Quantity=" + getQuantity();
    }
}
