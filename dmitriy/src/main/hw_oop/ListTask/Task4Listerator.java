package ListTask;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Задание 4
 * Используя Intelij IDEA создать проект, пакет.
 * Создать класс Main, создать список целых чисел и используя listIterator пройтись по списку и увеличить
 * значения на 1;
 */
public class Task4Listerator {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(5);

        arr.add(0, 2);
        arr.add(1, 10);
        arr.add(2, 4);
        arr.add(3, 5);
        arr.add(4, 18);

        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer + 1);
        }
    }
}
