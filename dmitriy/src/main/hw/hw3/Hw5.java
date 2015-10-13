package hw3;

/**Задание 3
 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n. Например, среди чисел
 8,5 и 11,45 ближайшее к десяти 11,45.
*/

 public class Hw5 {
    public static void main(String[] args) {

        double m = 11.3;
        double n = 7;

        double a = 10 - m;
        double b = 10 - n;

        if (a < b) {
            System.out.println("Значення m ближче до 10. m = " + m);
        } else {
            System.out.println("Значення n ближче до 10. n = " + n);


        }
    }
}