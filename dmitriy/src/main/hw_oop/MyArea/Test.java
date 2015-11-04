package MyArea;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        double r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter the radius of a circle whose area you want to count - ");
        r = Double.parseDouble(sc.next());
        System.out.print("The area of circle is - " + MyArea.areaOfCircle(r));
    }
}
