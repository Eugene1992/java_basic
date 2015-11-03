package Rectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.print("Please, enter the first side of the rectangle - ");
        Scanner scanner = new Scanner(System.in);
        double side1 = Double.parseDouble(scanner.next());


        System.out.print("Please, enter the second side of the rectangle - ");
        double side2 = Double.parseDouble(scanner.next());
        Rectangle rectangle = new Rectangle(side1, side1);

        System.out.println("Area is - " + rectangle.areaCalculator(side1,side2));
        System.out.println("Perimeter is - " + rectangle.perimeterCalculator(side1, side2));
    }
}