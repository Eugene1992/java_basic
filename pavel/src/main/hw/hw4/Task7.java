package hw4;

import java.util.Scanner;

/**
 * Created by ppota on 10/16/2015.
 */
public class Task7 {
    public static void main(String[] args) {
            for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 0)
                    for (int z = 0; z < 4; z++)
                        System.out.print("- ");

                else
                    for (int z = 0; z < 4; z++) {
                        System.out.print("Ж ");
                    }
                        System.out.println();
        }
    }
}