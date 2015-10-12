package hw3;

/**
 * Created by ppota on 10/11/2015.
 */


//Задание 6
//        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить и выводить на экран
//        вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
public class task6 {
        public static void main (String [] args){
            int a=44;
            int b=2343;
            int c=3333;

            double numerator = -b + Math.sqrt(b*b - 4*a*c);

            int denominator = 2*a;

            double result = numerator / denominator;
            System.out.println(result);

        }
    }


