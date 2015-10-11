package hw4;

/**
 * Created by Оксана on 10.10.2015.
 *
 *
 * 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class SecondTask {
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println (i+=2);
        } while (i<55);
    }
}

