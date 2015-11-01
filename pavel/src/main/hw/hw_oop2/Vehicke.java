package hw_oop2;

/**
 * Created by ppota on 10/31/2015.
 */
class Vehicle {

    public int price;
    public int speed;
    public int age;

    public static void main(String[] args) {


        Plane car = new Plane();
        car.setHigh(130);
        car.setPass(2);
        car.getHigh();
        car.getPass();

        Car port = new Car();
        port.setPort("Odessa Port #2");
        port.getPort();

        Vehicle car2 = new Vehicle();
        car2.setPrice(44);
        car2.getPrice();
        car2.setSpeed(240);
        car2.getSpeed();
        car2.setAge(1);
        car2.getAge();






        System.out.println(car.getHigh() + " " + car.getPass() + " " + port.getPort() + " " + car2.getPrice()+" "+car2.getSpeed()+" "+car2.getAge());
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}



