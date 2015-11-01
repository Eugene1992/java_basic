package hw2.task3;

/**
 * Created by Оксана on 01.11.2015.
 */
public class Ship {
    public static void main(String[] args) {

        Vehicle ship = new Vehicle();
        ship.setPrice(134242);
        ship.setSpeed(145);
        ship.setYear(2002);
        ship.setPassegers(32);
        ship.setPort(4);
        ship.getPrice();
        ship.getYear();
        ship.getSpeed();
        ship.getPassegers();
        ship.getPort();
        System.out.println(ship.getPrice()+" "+ship.getSpeed()+" "+ship.getYear()+" "+ship.getPassegers()+ " " +ship.getPort());
    }
    }

