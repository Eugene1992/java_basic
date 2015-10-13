package hw4;

/**
 * Created by ppota on 10/11/2015.
 */
//4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
public class Task4 {
    public static void main(String[] args) {

        for (int i=2, j = 0;i<=10000000; i=i*2, j++)
            if (j==20)break;
          else System.out.println(i);
    }
}
