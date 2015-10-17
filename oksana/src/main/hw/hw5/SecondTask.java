package hw5;



import java.util.Scanner;

/**
 * Created by Оксана on 15.10.2015.
 *
 * 2. Вывести все числа одномерного массива в обратном порядке
 *
 */
public class SecondTask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size =read.nextInt();
        System.out.println("Enter numbers in array ");
        int[] arr= new int[size];
        for(int i=0;i<size; ++i)
            arr[i]=read.nextInt();
        System.out.println("Changed array");
        for(int i=(size-1);i>=0;--i){
            System.out.println(" " + arr[i]);
        }

    }
}
