package hw3;

/**
 * Created by Оксана on 08.10.2015.
 * Задание 2
 Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n,
 чётным либо нечётным.
 */


public class FirstTask {
    public static void main(String[] args) {
        int n = 7;

        if ((n % 2) == 0) {
            System.out.println("Число " + n + " четное ");
        } else {
            if ((n % 1) == 0) {
                System.out.println("Число " + n + " нечетное ");
            }
        }
    }
}