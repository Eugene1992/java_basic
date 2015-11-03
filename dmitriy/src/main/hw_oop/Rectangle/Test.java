package Rectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        System.out.print("Please, enter the first side of the rectangle - ");
        Scanner scanner = new Scanner(System.in);
        rectangle.setSide1(Double.parseDouble(scanner.next()));


        System.out.print("Please, enter the second side of the rectangle - ");
        rectangle.setSide2(Double.parseDouble(scanner.next()));

        System.out.println("Area is - " + rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()));
        System.out.println("Perimeter is - " + rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
    }
}