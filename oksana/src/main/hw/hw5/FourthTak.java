package hw5;

import java.util.Scanner;

/**
 * Created by Оксана on 16.10.2015.
 *
 * . Вывести первую и вторую половину одномерного массива в обратном порядке
 *

 */
public class FourthTak {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =read.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr= new int[size];
        for(int i=0; i<size; ++i)
            arr[i]=read.nextInt();
        for(int i=(arr.length-1); i>=(arr.length)/2; --i){
            System.out.print(" " + arr[i]);

        }
        System.out.println("");
        for(int i=((arr.length/2-1)); i>=0; --i){
            System.out.print(" " + arr[i]);
        }
    }
}

