package hw1;
/**
 * CЗадание 3
 * Используя IntelliJ IDEA, создайте класс circle.
 * Создайте константу с именем PI (число π «пи»),
 * создайте переменную радиус с именем – r.
 * Используя формулу πR2, вычислите площадь круга и выведите результат на экран.
 */
public class Circle {
    public static void main(String[] args){

        final double pi = 3.14;
        int r = 34;
        double r2 = Math.pow(r,2) ;
        double area = pi * r2;

        System.out.println(area);
    }
}
