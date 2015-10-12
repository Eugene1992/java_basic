package hw3;

import java.util.Scanner;

/**
 * Created by ppota on 10/11/2015.
 */


//Задание 8
//        Используя IntelliJ IDEA, создайте класс Interval.
//        Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой промежуток [0 - 14]
//        [15 - 35] [36 - 50][50 - 100]. Если да, то укажите, в какой именно промежуток. Если пользователь указывает число не
//        входящее ни в один из имеющихся числовых промежутков, то выводится соответствующее сообщение.
public class task8 {
    public static void main(String[] args) {
        int digital;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        digital = sc.nextInt();

        if (digital > 0 && digital <= 14)System.out.println("Числовой промежуток [0 - 14]");
        if (digital >= 15 && digital <= 35)System.out.println("Числовой промежуток [15 - 35]");
        if (digital >= 36 && digital <= 50)System.out.println("Числовой промежуток [36 - 50]");
        if (digital >= 50 && digital <= 100)System.out.println("Числовой промежуток [50 - 100]");
        if (digital > 100)System.out.println("Числовой промежуток не соотвецтвует ни одному диапазону");

        }
}
