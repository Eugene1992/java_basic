package hw4;

import java.util.Scanner;

/**
 * Created by ppota on 10/18/2015.
 */
public class Task11 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число A");
        a = scn.nextInt();

        Scanner scn1 = new Scanner(System.in);
        System.out.println("Введите натуральное число B");
        b = scn1.nextInt();



        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println("Общий делитель двух натуральных чисел =  " +a);
    }
}
