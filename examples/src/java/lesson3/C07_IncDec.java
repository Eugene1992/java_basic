package lesson3;

/**
 * Created by WebCamp on 01.07.2015.
 */
public class C07_IncDec {

    // Операторы Инкремента и Декремента (Increment and Decrement Operators)

    public static void main(String[] args) {

        System.out.println("----- Постфиксный инкремент"); // Post-increment

        byte number1 = 0;
        System.out.println(number1++); // Сначала выводим на экран, потом увеличиваем на 1.
        System.out.println(number1);

        System.out.println("----- Префиксный инкремент"); // Pre-increment

        byte number2 = 0;
        System.out.println(++number2); // Сначала увеличиваем на 1, потом выводим на экран.

        System.out.println("----- Постфиксный декремент"); // Post-decrement

        byte number3 = 0;
        System.out.println(number3--); // Сначала выводим на экран, потом уменьшаем на 1.
        System.out.println(number3);

        System.out.println("----- Префиксный декремент"); // Pre-decrement

        byte number4 = 0;
        System.out.println(--number4); // Сначала уменьшаем на 1, потом выводим на экран.
    }
}
