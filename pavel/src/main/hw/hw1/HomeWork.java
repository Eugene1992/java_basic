package hw1;

/**
 * Created by ppota on 10/8/2015.
 */




//
//Задание 1
//        Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
//        Выполните и рассчитайте результат следующих операций для этих переменных:
//
//        x += y - x++ * z;
//        z = --x – y * 5;
//        y /= x + 5 % z;
//        z = x++ + y * 5;
//        x = y - x++ * z;
public class HomeWork {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;

        x += y - x++ * z;
        System.out.println(x);

        y /= x + 5 % z;
        System.out.println(y);

        z = x++ + y * 5;
        System.out.println(z);

        x = y - x++ * z;
        System.out.println(x);

    }

}