import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Евгений on 02.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        //Создать четыре целочисленные переменные типов byte, short, int, long.

        byte     a;
        short    b;
        int      c;
        long     d;

        //Инициализировать переменную типа byte результатом суммы двух любых чисел
        a = 1+1; // 2
        System.out.println(a);

        //Инициализировать переменную типа short  результатом вычитания двух любых чисел
        b = 4-2; // 2
        System.out.println(b);

        //Инициализировать переменную типа int результатом деления двух любых чисел
        c = 3 / 3; // 1
        System.out.println(c);

        //Инициализировать переменную типа long результатом умножения двух любых чисел
        d = 3000 * 3000; // 9000000
        System.out.println(d);

        //Передать перменной типа byte результат суммы двух переменной типа byte
        a=(byte) (a+a); // 4
        System.out.println(a);

        //Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        a = (byte) (b+b/a); // 2+2/2=1
        System.out.println(a);

        //Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        c = (b/b*a);
        System.out.println(c);

        //Поменять значения двух целочисленных переменных используя третью
        a = 3;



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
