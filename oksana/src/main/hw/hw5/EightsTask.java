package hw5;

import java.util.Scanner;

/**
 * Created by Оксана on 16.10.2015.
 *
 * Заменить все отрицательные числа в массиве на 0
 */
public class EightsTask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter tje size of array: ");
        int size = read.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = read.nextInt();
        }
        for (int i = 0; i < size; ++i) {
            if (arr[i] < 0) {
                arr[i] = 0;}
                System.out.print( arr[i]+" " );

            }

        }
    }



