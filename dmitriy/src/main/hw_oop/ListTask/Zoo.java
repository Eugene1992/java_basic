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

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Cow");
        arrayList.add("Mouse");
        arrayList.add("Pig");
        arrayList.add("Lion");
        arrayList.add("Hipo");
        arrayList.add("Tiger");

        System.out.println("Task 1 - " + arrayList);
        System.out.println();

        /*Задание 3
        * Используя Intelij IDEA создать проект, пакет.
        * Используя класс ListTask Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
        **/

        arrayList.remove("Cow");
        arrayList.remove("Pig");
        arrayList.remove("Tiger");

        System.out.println("Task 2 - " + arrayList);
        System.out.println("Size of List is - " + arrayList.size());
    }
}