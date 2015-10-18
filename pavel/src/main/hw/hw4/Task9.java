package hw4;

import java.util.Scanner;

/**
 * Created by ppota on 10/18/2015.
 */
public class Task9 {
    public static void main(String[] args) {
        int a;
        long b = 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (scn.hasNextInt()) {
            a = scn.nextInt();
            for (int i = a; i > 0; i--) {
                b *= i;
            }
            System.out.println("Факториал числа " + a + " равен " + b);
        } else System.out.println("Ошибка. Введено не число");

    }
}







