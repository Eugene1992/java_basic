package hw3;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Задание 8
 Используя IntelliJ IDEA, создайте класс Interval.
 Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой промежуток [0 - 14]
 [15 - 35] [36 - 50][50 - 100]. Если да, то укажите, в какой именно промежуток. Если пользователь указывает число не
 входящее ни в один из имеющихся числовых промежутков, то выводится соответствующее сообщение.
 */
public class Hw8 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        out.println("Введіть число від 0 до 100");
        int number = myScanner.nextInt();

        if (number <= 14) {
            System.out.println("Число знаходиться в діапазоні від 0 до 14. Число = " + number);
        } else {
            if (15 <= number & number <= 35) {
                System.out.println("Число знаходиться в діапазоні від 15 до 35. Число = " + number);

            } else {
                if (36 <= number & number <= 50) {
                    System.out.println("Число знаходиться в діапазоні від 36 до 50. Число = " + number);
                } else {
                    if (51 <= number & number <= 100) {
                        System.out.println("Число знаходиться в діапазоні від 51 до 100. Число = " + number);
                    } else {
                        System.out.print("Число знаходиться поза зоною діапазона від 0 до 100!");
                    }
                }


            }
        }
    }
}