package Vehicle;

public class Test {
    public static void main(String[] Args){

        Vehicle car = new Car("Mazda",2000, 120, 1988);
        Vehicle plane = new Plane("AeroBuss",145000, 300, 1999,15000,30);
        Vehicle ship = new Ship("Titanic",18000, 8, 2015, 15, "Gonalulu");

        Vehicle vehicle[] = new Vehicle[3];

        vehicle[0] = car;
        vehicle[1] = plane;
        vehicle[2] = ship;

        for (Vehicle masVehicle : vehicle){
            System.out.println(masVehicle.toString());
        }


    }
}
