package hw4;

/**
 * Created by Оксана on 10.10.2015.
 *
 * 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class FourthTask {
    public static void main(String[] args) {
        for (int i=2; i<129; i=i*2){
            System.out.println(i*2);
        }
    }
}
