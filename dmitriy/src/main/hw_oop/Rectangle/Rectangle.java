package Rectangle;

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

    public Rectangle(){
        this.side1 = side1;
        this.side2 = side2;
    }
    public double areaCalculator (double getSide1, double getSide2){
        double area = getSide1 * getSide2;
        return area;
    }
    public double perimeterCalculator (double getSide1, double getSide2){
        double perimeter = 2 * (getSide1 + getSide2);
        return perimeter;
    }
}
