package hw3;

/**
 * Created by Оксана on 08.10.2015.
 *
 *
 * Задание 4
 Задано три переменных, найти переменную с максимальным значением (Значение все переменных разные).
 */
public class ThirdTask {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=65;
        if ((a>b) &(b>c)){
            System.out.println("max " + a);
        }else{
            if((b>a) & (a>c)){
                System.out.println("max "+b);
            }else{
                System.out.println("max " +c);
            }
        }
    }
}
