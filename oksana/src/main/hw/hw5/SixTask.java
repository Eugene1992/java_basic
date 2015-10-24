package hw5;

import java.util.Scanner;

/**
 * Created by Оксана on 16.10.2015.
 *
 *  Найти среднеарифметическое всех чисел массива
 */
public class SixTask {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of arrey: ");
        int size = read.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr= new int[size];
        for(int i = 0; i<size; ++i)
            arr[i]=read.nextInt();
        double sum=0;
        for(int i=0; i<arr.length;++i )
            sum=sum+arr[i];
        double averege=sum/size;
        System.out.println("Avarage number of all elements in array "+averege);
    }


}
