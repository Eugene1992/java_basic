package hw5;

import java.util.Scanner;

/**
 * Created by Оксана on 19.10.2015.
 * 1. Вывести в консоль все парные числа одномерного массива
 2. Вывести все числа одномерного массива в обратном порядке
 3. Вывести первую и вторую половину одномерного массива
 4. Вывести первую и вторую половину одномерного массива в обратном порядке
 5. Найти сумму все элементов в массиве
 6. Найти среднеарифметическое всех чисел массива





 */
public class MethodTask {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int sum1 = 0;
        System.out.println("Enter the size of array: ");
        int size = read.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr1 = new int[size];
        for (int i = 0; i < size; ++i)
            arr1[i] = read.nextInt();
        for (int i = 0; i < size; ++i)

        {
            System.out.println("Enter the number of task");
            int task = read.nextInt();
            switch (task) {
                case 1:
                    System.out.println(array(arr1));
                    break;
                case 2:
                    System.out.println(Change(arr1));
                    break;
                case 3:
                    System.out.println(parts(arr1));
                    break;
                case 4:
                    System.out.println(partchange(arr1));
                    break;
                case 5:
                    System.out.println(sum(arr1,sum1));
                    break;
                default:
                    System.out.println("?");
            }
        }
    }


    public static String array(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0)
                System.out.println("" + arr[i]);
        }

        return result;
    }

    public static String Change(int[] arr) {
        String change = "";
        System.out.println("Changed array");
        for (int i = 0; i < arr.length; ++i) ;
        for (int i = (arr.length - 1); i >= 0; --i) {
            System.out.println(" " + arr[i]);
        }

        return change;
    }

    public static String parts(int[] arr) {
        String part = "";
        for (int i = 0; i < arr.length; ++i) ;
        for (int i = 0; i < (arr.length) / 2; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ");
        for (int i = ((arr.length) / 2); i < (arr.length); i++) {
            System.out.print(" " + arr[i]);
        }

        return part;
    }

    public static String partchange(int[] arr) {
        String partchange = "";
        for (int i = 0; i < arr.length; ++i) ;
        for (int i = (arr.length - 1); i >= (arr.length) / 2; --i) {
            System.out.print(" " + arr[i]);

        }
        System.out.println("");
        for (int i = ((arr.length / 2 - 1)); i >= 0; --i) {
            System.out.print(" " + arr[i]);
        }

        return partchange;
    }

    public static String sum(int[] arr,int sum1) {
        String sum = "";
        for (int i = 0; i < arr.length; ++i) {
            for (i = 0; i < arr.length; i++) {
                sum1 = sum1 + arr[i];
            }
            System.out.println("The sum of array  " + sum1);
        }

        return sum;
    }
}
