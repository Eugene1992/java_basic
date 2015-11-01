package hw2.task3;

/**
 * Created by Оксана on 01.11.2015.
 */
public class Plane {
    public static void main(String[] args) {
        Vehicle plane = new Vehicle();
        plane.setPrice(134242);
        plane.setSpeed(145);
        plane.setYear(2002);
        plane.setPassegers(32);
        plane.setHight(900);
        plane.getPrice();
        plane.getYear();
        plane.getSpeed();
        plane.getPassegers();
        plane.getHight();
        System.out.println(plane.getPrice() + " " + plane.getSpeed() + " " + plane.getYear() + " " + plane.getPassegers() + " " + plane.getHight());
    }
}
