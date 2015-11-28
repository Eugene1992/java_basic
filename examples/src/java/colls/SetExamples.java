package colls;


import org.junit.Test;

import java.util.*;

public class SetExamples {

    @Test
    public void hashSetTest() {
        Set<String> cars = new HashSet<>();

        /* добавление элементов */
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
    public void linkedHashSetTest() {
        Set<String> cars = new LinkedHashSet<>();

        /* добавление элементов */
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
    public void treeSetTest() {
        Set<String> cars = new TreeSet<>();

        /* добавление элементов */
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

    public void iterate(Set<String> set) {
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String currentCar = setIterator.next();

            System.out.println(currentCar);
        }
    }

}
