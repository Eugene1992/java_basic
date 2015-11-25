package colls;

import org.junit.Test;

import java.util.*;

public class MapExample {
    @Test
    public void hashMapTest() {
        Map<Integer, String> cars = new HashMap<>();

        /* добавление элементов */
        cars.put(1, "BMW");
        cars.put(2, "Mercedes");
        cars.put(3, "Aston Martin");
        cars.put(4, "BMW");
        cars.put(4, "Chevrolet");
        cars.put(4, "Jeap");
        cars.put(4, "Bentley");
        cars.put(4, "BMW");
        cars.put(4, "Aston Martin");
        cars.put(4, "BMW");

        iterate(cars);
    }

    @Test
    public void linkedHashMapTest() {
        Map<Integer, String> cars = new LinkedHashMap<>();

        /* добавление элементов */
        cars.put(1, "BMW");
        cars.put(2, "Mercedes");
        cars.put(3, "Aston Martin");
        cars.put(4, "BMW");
        cars.put(4, "Chevrolet");
        cars.put(4, "Jeap");
        cars.put(4, "Bentley");
        cars.put(4, "BMW");
        cars.put(4, "Aston Martin");
        cars.put(4, "BMW");

        iterate(cars);
    }

    @Test
    public void treeMapTest() {
        Map<Integer, String> cars = new TreeMap<>();

        /* добавление элементов */
        cars.put(1, "BMW");
        cars.put(2, "Mercedes");
        cars.put(3, "Aston Martin");
        cars.put(4, "BMW");
        cars.put(4, "Chevrolet");
        cars.put(4, "Jeap");
        cars.put(4, "Bentley");
        cars.put(4, "BMW");
        cars.put(4, "Aston Martin");
        cars.put(4, "BMW");

        iterate(cars);
    }

    public void iterate(Map<Integer, String> map) {
        Iterator<Map.Entry<Integer, String>> setIterator = map.entrySet().iterator();
        while (setIterator.hasNext()) {
            Map.Entry<Integer, String> carEntry = setIterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }
    }
}
