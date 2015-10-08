package hw3;

/**
 * Created by Оксана on 08.10.2015.
 *
 * Задание 3
 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n. Например, среди чисел
 8,5 и 11,45 ближайшее к десяти 11,45.

 */
public class SecondTask {
    public static void main(String[] args) {
        int a = 10;
        double b = 8.5;
        double c = 11.45;

        if ((byte)(a - b) < (byte)(c - b)) {
            System.out.println("Число " + c  );
        }else{

                System.out.println("Число " + b);
            }
        }
    }
