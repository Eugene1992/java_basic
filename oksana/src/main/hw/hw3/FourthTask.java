package hw3;

/**
 * Created by Оксана on 08.10.2015.
 *
 *
 *
 * Задание 5
 Задано четыре переменных, найти вторую по величине.
 */
public class FourthTask {
    public static void main(String[] args) {
        int a=100;
        int b=2;
        int c=5;
        int d=34;
        if((a>b)&(b>c)&(c>d)){
            System.out.println("Second one:" +b);
        }else{
            if((b>a)&(a>c)&(c>d)){
                System.out.println("Second one:" +a);
            } else{
                if((a>c)&(c>b)&(b>d)){
                    System.out.println("Second one:" +c);
                }else{
                    if((a>d)&(d>c)&(c>b)){
                        System.out.println("Second one:" +d);
                    }
                }
            }
        }
    }
}
