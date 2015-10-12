package hw3;

/**
 * Created by ppota on 10/11/2015.
 */

//Задано три переменных, найти переменную с максимальным значением (Значение все переменных разные).
public class task4 {
    public static void main(String[] args) {

        int max;
        int a = 123;
        int b = 11;
        int c = 22;

        if (a > b) max = a;
        else max = b;

        if (c > max)
            max = c;
        System.out.println(max + " максимальное число");
    }
}
