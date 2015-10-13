package hw4;

/**
 * Created by Оксана on 10.10.2015.
 *
 * 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 *
 */
public class FirstTask {
    public static void main(String[] args) {
        for (int i=1000; i<9999; i+=3){
            System.out.println(i+=3 );
        }

    }
}
