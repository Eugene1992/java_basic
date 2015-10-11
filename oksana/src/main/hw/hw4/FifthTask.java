package hw4;

/**
 * Created by Оксана on 10.10.2015.
 *
 * 5. Выведите на экран первые 20 членов последовательности Фибоначчи.
 */
public class FifthTask {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum;

        for (int i = 0; i < 20; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");

        }
    }
}


