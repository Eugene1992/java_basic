package hw3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ppota on 10/11/2015.
 */
public class task3 {
    public static void main(String[] args) {

        int max;
        int a = 123;
        int b = 11;
        int c = 22;
        if (a > b)
            max = a;
        else max = b;

        if (c > max)
            max = c;
        System.out.println(max + " максимальное число");








    }
}

//        // создаём объект класса Scanner
//        int i = 2;
//        System.out.print("Введите целое число: ");
//        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
//            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
//            System.out.println(i*2);
//        } else {
//            System.out.println("Вы ввели не целое число");
//        }
//    }
//}

//            System.out.println("Введите значиние А");
//            Scanner a = new Scanner(System.in);
//            System.out.println("Введите значиние B");
//            Scanner b = new Scanner(System.in);
//            System.out.println("Введите значиние C");
//            Scanner c = new Scanner(System.in);




