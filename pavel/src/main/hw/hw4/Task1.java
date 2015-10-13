package hw4;

/**
 * Created by ppota on 10/11/2015.
 */


//1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
public class Task1 {
    public static void main(String[] args) {

        for (long i = 1000; i < 10000; i = i + 3) {
            System.out.println(i);
        }
    }


}
