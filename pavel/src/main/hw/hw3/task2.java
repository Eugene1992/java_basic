package hw3;

/**
 * Created by ppota on 10/8/2015.
 */


//        Задание 2
//        Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n,
//                чётным либо нечётным.
public class task2 {
    public static void main(String args[]) {
        int n = 10;
        if(n % 2 == 0) {
            System.out.println("Число " + n + " четное");
        } else {
            System.out.println("Число " + n + " нечетное");
        }

    }
}
