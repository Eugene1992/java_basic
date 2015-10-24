package hw5;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by Оксана on 16.10.2015.
 * <p>
 * <p>
 * <p>
 * 7. Найти минимальное и максимальное число в массиве
 */
public class SeventhTask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = read.nextInt();
        System.out.println("Enter the elements ");
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i)
            arr[i] = read.nextInt();
        int mn, mx;
        mn = mx = arr[0];
        for (int i = 0; i < size; ++i) {
            mn = min(mn, arr[i]);
            mx = max(mx, arr[i]);
        }
        System.out.print("Max and min elements  ");
        System.out.println( mx+ " " + mn);

    }
}