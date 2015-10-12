package hw3;

import java.io.Console;

/**
 * Created by ppota on 10/11/2015.
 */


//Задание 5 Задано четыре переменных, найти вторую по величине.
public class task5 {
    public static void main(String[] args) {
        int max;
        int premax;
        int a = 4;
        int b = 1;
        int c = 10;
        int d = 5;


        if (a > b) max = a;
        else max = b;

               if (c > max)
                  max = c;

                if (d > max)
                  max = d;

        if (a>b&a<max&a!=max) premax = a;
        else premax =b;
        if (c >premax&c<max&c!=max)
            premax = c;
        if (d>premax&d<max&d!=max)
            premax =d;




        System.out.println(max);
        System.out.println(premax);
    }
}



