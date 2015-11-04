package hw23;

/**
 * Created by IT on 02.11.2015.
 */
public class Vehicle {
    private int x;
    private int y;
    private float price;
    private int speed;
    private int yer;

    public Vehicle(int x, int y, float price, int speed, int yer) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.yer = yer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getYer() {
        return yer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setYer(int yer) {
        this.yer = yer;
    }


}
