package hw4;

import java.util.Scanner;

/**
 * Created by Оксана on 11.10.2015.
 *
 * 10. Выведите на экран все положительные делители натурального числа, введенного пользователем.
 *
 */
public class TenthTask {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1; i<=n;++i)
            if (n % i ==0){
                System.out.println(i);
            }

    }


}
