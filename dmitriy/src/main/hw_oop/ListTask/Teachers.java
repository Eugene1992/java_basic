package ListTask;

import java.util.ArrayList;

/**
 * Задание
 * Используя Intelij IDEA создать проект, пакет.
 * Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
 * школы. И получить индекс самого лучшего учителя и самого неочень. Вывести список в консоль.
 */
public class Teachers {
     public static void main(String[] args) {
         ArrayList<String> arr = new ArrayList<>();

         arr.add("Марія Юрієвна");
         arr.add("Андрій Степанович");
         arr.add("Мерлін Менсон");
         arr.add("Дядя Ваня");
         arr.add("Супер Мен");
         arr.add("Євгеній Петрасян");
         arr.add("Чебурек Пекпек");
         arr.add("Персік Олегивіч");

         System.out.println("The beast teacher - " + arr.indexOf("Марія Юрієвна"));
         System.out.println("The worst teacher - " + arr.indexOf("Дядя Ваня"));
     }
}
