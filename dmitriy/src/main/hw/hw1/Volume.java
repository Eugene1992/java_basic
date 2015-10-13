package hw1;

/**
 * Задание 4
 *Используя IntelliJ IDEA, создайте класс volume.
 *Напишите программу расчета объема - V и площади поверхности -S цилиндра.
 *Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
 *Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
 *Результаты расчетов выведите на экран.
 */

public class Volume {
   public static void main(String[] args){


       double pi = 3.14;
       double r = 35.87;
       double r2 = Math.pow(r,2);
       double h = 43.36;
       double v = pi * (r2) * h;
       double s = ( (2*pi) * r2 ) + ( (2*pi) * r2 );


       System.out.println("Радиус цылиндра - " + r);
       System.out.println("Висота цилындра - " + h);
       System.out.println("Объем цылиндра - " + v);
       System.out.println("Площадь поверхности цылиндра - " + s);






   }



}
