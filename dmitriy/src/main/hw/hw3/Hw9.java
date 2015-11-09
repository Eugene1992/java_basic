package hw3;
/**
 * Задание 6
 В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить и выводить на экран
 вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
 */
// sout = System.out.println();
// psvm = public static void main(String[] args) {
public class Hw9 {
    public static void main(String[] args) {

        float a = 1;
        float b = 12;
        float c = 36;
        double d = (b * b) - (4 * a * c);
        float e = 0;
        float f = 0;

        if(d == 0){
            e = - 1 * (b / (2 * a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + e);
        } else if(d > 0){
                e = ((-1 * b)+(float)Math.sqrt(d)) / (2 * a);
                f = ((-1 * b) - (float)Math.sqrt(d)) / (2 * a);
                System.out.println("Уравнение имеет 2 квадратных корня: " + e + " и " + f);
            } else {System.out.println("Уравнение не имеет квадратных корней");}
        }
    }
