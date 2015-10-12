package hw4;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;
import static java.lang.Integer.toUnsignedString;

/**
 * Created by ppota on 10/12/2015.
 */
public class task6 {
    public static void main(String[] args) {
        int digital;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в 10ой системе числения:");
        digital = sc.nextInt();

        System.out.println("Введите систему числения 2/8/16:");
        String operation = sc.next();
        sc.close();

        switch(operation)
        {
            case "2":System.out.println(Integer.toBinaryString(digital));
                break;
            case "8": System.out.println(Integer.toOctalString(digital));
                break;
            case "16": System.out.println(Integer.toHexString(digital));
                break;
        }
    }
}
