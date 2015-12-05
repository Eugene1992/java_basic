package Collection.Hw1;

import java.util.*;

/**
 * Задание 3
 * Несколькими способами создайте коллекцию, в которой можно хранить только целочисленные и
 * вещественные значения, по типу «счет предприятия – доступная сумма» соответственно.
 */
public class Hw2 {
    public static void main(String[] args) {

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        Map<Integer, Integer> map3 = new TreeMap<>();

        map1.put(10, 1000);
        map1.put(11, 1100);
        map1.put(12, 1200);

        map2.put(13, 1300);
        map2.put(14, 1400);
        map2.put(15, 1500);

        map3.put(16, 1600);
        map3.put(17, 1700);
        map3.put(18, 1800);

        iterate(map1);
        System.out.println();
        iterate(map2);
        System.out.println();
        iterate(map3);
    }

    public static void iterate(Map<Integer, Integer> map) {
        Iterator<Map.Entry<Integer, Integer>> setIterator = map.entrySet().iterator();
        while (setIterator.hasNext()) {
            Map.Entry<Integer, Integer> carEntry = setIterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }
    }
}



