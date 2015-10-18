package hw5;

        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

/**
 * Created by ppota on 10/18/2015.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] myList = {4, 9, 2, 9, 3, 4, 3, 5, 66, 78, 99};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 == 0) {
                System.out.println("Число " + myList[i] + " четное");
            }
        }
    }
}