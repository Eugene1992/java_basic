package hw4;

import java.util.Scanner;

/**
 * Created by Оксана on 11.10.2015.
 *
 * 11. Выведите на экран общие делители двух натуральных чисел, введенных пользователем.
 *
 */
public class EleventhTask {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Введите число:");
        Scanner in1 = new Scanner(System.in);
        int k = in1.nextInt();

        for (int i = 1; i <= n; ++i)
            if (n % i == 0) {
                if (k % i == 0) {
                    System.out.println(i);
                }
            }
    }
}
