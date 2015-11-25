package colls;

import org.junit.Test;

import java.util.*;

public class ListExample {

    @Test
    public void arrayListExample(){
        List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Aston Martin");
        cars.add("BMW");
        cars.add("Chevrolet");
        cars.add("Jeap");
        cars.add("Bentley");
        cars.add("BMW");
        cars.add("Aston Martin");
        cars.add("BMW");

        iterate(cars);
    }

    @Test
    public void linkedListExample(){
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Aston Martin");
        cars.add("BMW");
        cars.add("Chevrolet");
        cars.add("Jeap");
        cars.add("Bentley");
        cars.add("BMW");
        cars.add("Aston Martin");
        cars.add("BMW");

        iterate(cars);
        System.out.println("--------------------");

        Iterator<String> setIterator2 = cars.descendingIterator();
        while (setIterator2.hasNext()) {
            String currentCar = setIterator2.next();

            System.out.println(currentCar);
        }
    }

    public void iterate(List<String> set) {
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String currentCar = setIterator.next();

            System.out.println(currentCar);
        }
    }

    /*http://www.karambelkar.info/2012/06/java-1.7-collections---uml-class-diagrams/*/
}
