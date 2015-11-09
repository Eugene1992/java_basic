package MyArea;

import com.sun.corba.se.impl.interceptors.PICurrent;

/*Задание
        Используя Intelij IDEA создать проект, пакет.
        Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
        должен принимать радиус и используя PI посчитать площадь круга.
        Создать класс Main, где запустить данный метод.
**/
public class MyArea {

    final static double PI = 3.14;
    String name;

    public static double areaOfCircle(double r){
        double s = (double) PI * (Math.pow(r,2));
        return s;
    }
}
