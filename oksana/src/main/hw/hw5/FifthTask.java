package hw5;

import java.util.Scanner;

/**
 * Created by Оксана on 16.10.2015.
 *
 * Найти сумму все элементов в массиве
 *
 */
public class FifthTask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size =read.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[size];
        for(int i=0; i<size;++i)
            arr[i] = read.nextInt();
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("The sum of array  "+sum);
    }



}

