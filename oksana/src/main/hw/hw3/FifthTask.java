package hw3;

/**
 * Created by Оксана on 08.10.2015.
 *
 * Задание 6
 В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить и выводить на экран
 вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
 */
public class FifthTask {
    public static void main(String[] args) {
        int a=4;
        int b=6;
        int c=9;
        double d = a*a-4*a*c;;
        double d1 = Math.sqrt(d);
        double x1;
        double x2;
        if (d>0){
            x1= (-b + d1)/(2*a);
            x2= (-b - d1)/(2*a);
            System.out.println("X1="+x1);
            System.out.println("X2="+x2);
        }else{
            if(d==0){
                x1= (-b + d1)/(2*a);
                System.out.println("X1="+x1);
            }else{
                if (d<0){
                    System.out.println("ERRORRR");

                }
            }
        }

    }
}
