package Rectangle;

import java.util.Scanner;

public class Rectangle {

    private double side1;
    private double side2;

    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }

    public void setSide1(double newSide1){side1 = newSide1;}
    public void setSide2(double newSide2){side2 = newSide2;}

    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator(double side1, double side2){
        double area = (double) side1 * side2;
        return area;
    }
    public double perimeterCalculator (double side1, double side2){
        double perimeter = (double)(2 * (side1 + side2));
        return perimeter;
    }
}
