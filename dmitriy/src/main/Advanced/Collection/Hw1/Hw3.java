package Collection.Hw1;

import java.util.*;

/**
 * Используя класс HashMap, создайте небольшую коллекцию и выведите на экран значения пар «ключ-
 * значение» сначала в алфавитном порядке, а затем в обратном. ***
 */
public class Hw3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("a", "Vasiliy Mudakovich");
        map.put("c", "Hay yomu gretc");
        map.put("b", "Mamba");
        map.put("e", "Cheburek pekpek");
        map.put("d", "Demanu");
        map.put("r", "dkfmvcd");

        Iterator<Map.Entry<String, String>> itr1 = map.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry<String, String> entry = itr1.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println();

        List<String> list = new ArrayList<>();
        list.addAll(map.keySet());

        Collections.sort(list);
        System.out.println(list);

        for (String s : list){
            System.out.println(s + " = " + map.get(s));
        }

        System.out.println();
        Collections.reverse(list);
        System.out.println(list);

        for (String s : list){
            System.out.println(s + " = " + map.get(s));
        }
    }
}
