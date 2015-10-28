package hw1;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Евгений on 02.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        //Создать четыре целочисленные переменные типов byte, short, int, long

        byte     a;
        short    b;
        int      c;
        long     d;

        //Инициализировать переменную типа byte результатом суммы двух любых чисел
        a = 1+1; // 2
        System.out.println("Инициализировать переменную типа byte результатом суммы двух любых чисел");
        System.out.println(a);

        //Инициализировать переменную типа short  результатом вычитания двух любых чисел
        b = 4-2; // 2
        System.out.println("Инициализировать переменную типа short  результатом вычитания двух любых чисел");
        System.out.println(b);

        //Инициализировать переменную типа int результатом деления двух любых чисел
        c = 3/3; // 1
        System.out.println("Инициализировать переменную типа int результатом деления двух любых чисел");
        System.out.println(c);

        //Инициализировать переменную типа long результатом умножения двух любых чисел
        d = 3000 * 3000; // 9000000
        System.out.println("Инициализировать переменную типа long результатом умножения двух любых чисел");
        System.out.println(d);

        //Передать перменной типа byte результат суммы двух переменной типа byte
        a=(byte) (a+a); // 4
        System.out.println("Передать перменной типа byte результат суммы двух переменной типа byte");
        System.out.println(a);

        //Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        a = (byte) (b+b/a); // 2+2/2=1
        System.out.println("Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte");
        System.out.println(a);

        //Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        c = (b/b*a);
        System.out.println("Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte");
        System.out.println(c);

        //Поменять значения двух целочисленных переменных используя третью
        byte k1;
        byte k2;
        byte k3;

        k1 = 11;
        k2 = 65;
        System.out.println("Число к1 до конвертации");
        System.out.println(k1);
        System.out.println("Число к2 до конвертации");
        System.out.println(k2);

        k3 = k1;
        k1 = k2;
        k2 = k3;

        System.out.println("Число к1 после конвертации");
        System.out.println(k1);
        System.out.println("Число к2 после конвертации");
        System.out.println(k2);

        //Поменять значения двух переменных без использования третей
        int a1;
        int b1;

        a1 = 1;
        b1 = 2;
        System.out.println("Число а1");
        System.out.println(a1);
        System.out.println("Число b1");
        System.out.println(b1);

        a1 = b1+a1;
        b1 = a1-b1;
        a1 = a1-b1;

        System.out.println("Результат а1");
        System.out.println(a1);
        System.out.println("Результат b1");
        System.out.println(b1);


//        Дано число от 0 до 255 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
//        систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)!!! Пример:
//
//        byte b = 103;
//        ...
//        < Ваш код :) >
//        ...
//        Вывод в консоль в следующем виде:
//        0110 0111
//
//        Важно чтобы вывод включал в себя все разряды! То есть, даже если число 3 в двоичной системе равно 11, вывод в консоль
//        должен быть в ввиде 0000 0011.

        int DEX;
        DEX = 15554;
        System.out.println("Указаное число в DEX");
        System.out.println(DEX);

        System.out.println("Число переведеное в BIN");
        System.out.printf(String.format("%16s", Integer.toBinaryString(DEX)).replace(' ', '0'));

    }

}
