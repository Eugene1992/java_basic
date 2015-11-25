package ListTask;

import java.util.ArrayList;
/**
 * Задание 2
 * Используя Intelij IDEA создать проект, пакет.
 * Создать класс ListTask. В классе создать список, в который записать 8 животных через метод add(index,
 * element).
 * Вывести список в консоль.
 */
public class Zoo {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(8);

        arrayList.add(0, "Cat");
        arrayList.add(1, "Dog");
        arrayList.add(2, "Cow");
        arrayList.add(3, "Mouse");
        arrayList.add(4, "Pig");
        arrayList.add(5, "Lion");
        arrayList.add(6, "Hipo");
        arrayList.add(7, "Tiger");

        System.out.println("Task 1 - " + arrayList);

        /*Задание 3
        * Используя Intelij IDEA создать проект, пакет.
        * Используя класс ListTask Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
        **/

        arrayList.remove(3);
        arrayList.remove(5);
        arrayList.remove(7);

        System.out.println("Task 2 - " + arrayList);
        System.out.println("Size of List is - " + arrayList.size());
    }
}