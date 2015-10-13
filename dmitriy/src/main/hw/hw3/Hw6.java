package hw3;

/**
 * Задание 4
 Задано три переменных, найти переменную с максимальным значением (Значение все переменных разные).

 */
public class Hw6 {
    public static void main(String[] args) {

        int a = 26;
        int b = 27;
        int c = 13;

        if (a > b && a > c) {
            System.out.println("Значення А є максимальним. A = " + a);
        } else {
            if (b > a && b > c) {
                System.out.println("Значення B є максимальним. B = " + b);
            } else {
                if (c > a && c > b) {
                    System.out.println("Значення C є максимальним. C = " + c);
                } else {
                    if (a == b || a == c || b == c || a == b) {
                        System.out.println("Знайдено рівні по значенню числа!");
                    } else {
                        System.out.println("?");
                    }
                }
            }
        }
    }
}