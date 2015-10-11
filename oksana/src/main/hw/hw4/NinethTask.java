package hw4;

import java.util.Scanner;

/**
 * Created by Оксана on 11.10.2015.
 *
 * 9. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 *
 */
public class NinethTask {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=1;
        for (int i=1; i<=n; i++) {
            a = a * i;
        }
        System.out.println("n!="+a);
    }
}
