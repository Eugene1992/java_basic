package hw3;

/**
 * Created by Администратор on 11.10.2015.
 */
public class Hw4 {
    public static void main(String[] args) {

        /**Задание 4
         Используя IntelliJ IDEA, создайте класс volume.
         Напишите программу расчета объема - V и площади поверхности -S цилиндра.
         Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
         Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
         Результаты расчетов выведите на экран.
         */

        int r = 15;
        double r2 = Math.pow(r,2);
        double pi = 3.14;
        int h = 45;

        double v = pi * r2 * h;
        System.out.println("Обем цылиндра V = " + v);

        double s = 2*pi*r *(r + h);
        System.out.println("Площадь цылиндра S = " + s);
        double s2 = (2*pi*r2) + (2*pi*r2);
        System.out.println("Площадь цылиндра S2 = " + s2);


    }
}
