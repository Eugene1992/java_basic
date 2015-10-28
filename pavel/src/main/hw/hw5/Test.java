package hw5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by ppotanin on 10/19/2015.
 */
public class Test {
    public static void main(String[] args) {
        int[] myList = {4, 9, 2, 88, 3, 4, 3, 5, 66, 78, 99};

        sortMass(myList);
    }

    public static void sortMass(int[] arr) {
        Arrays.sort(arr);
        printArray(arr);
    }


    public static void printArray(int arr[]) {
        String intArrayString = Arrays.toString(arr);
        System.out.println(intArrayString);
    }
}



























