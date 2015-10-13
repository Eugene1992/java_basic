package hw1;

/**
 * Created by ppota on 10/8/2015.
 */

//Задание 4
//        Используя IntelliJ IDEA, создайте класс volume.
//        Напишите программу расчета объема - V и площади поверхности -S цилиндра.
//        Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
//        Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
//        Результаты расчетов выведите на экран.
public class Volume {
    public static void main  (String[] args){
        final double Pi = 3.1415926536;
        double R;
        double h;
        double V;
        double S;

        R= 10;
        h =11;

        V = (Pi*R)*(2*h);
        S = 2*(Pi*R)*(R+h);

        System.out.println("Обєм циліндра  "+V);
        System.out.println("Площа поверхні циліндра  "+S);

    }
}
