package hw4;

import java.util.Scanner;

/**
 * Created by ppota on 10/18/2015.
 */
public class Task10 {
    public static void main(String[] args) {
        int a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");

        if (scn.hasNextInt()) {
            a = scn.nextInt();
            System.out.print("Делителями числа " + a + " являются ");
            for (int i = a; i > 0; i--) {
                int b = a % i;
                if (b == 0)
                    System.out.print(i + " ");
            }
        } else System.out.println("Ошибка. Введено не число");

    }
}

