package hw4;

/**
 * Created by Оксана on 10.10.2015.
 *
 *
 * 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class ThirdTask {
    public static void main(String[] args) {
        int i=90;
        do{
            System.out.println(i=i-5);
        }while (i>0);
    }
}


