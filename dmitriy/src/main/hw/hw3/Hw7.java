package hw3;

/**Задание 5
 *Задано четыре переменных, найти вторую по величине.
 *
 */
public class Hw7 {
    public static void main(String[] args) {

        byte a = 3;
        byte b = 4;
        byte c = 5;
        byte d = 12;

        if ((a > b && b > c && b > d) || (c > b && b > a && b > d) || (d > b && b > c && b > a)) {
            System.out.println("Друге за величиною b = " + b);

        }
        if ((d > a && a > c && a > b) || (c > a && a > b && a > d) || (b > a && a > c && a > d)) {
            System.out.println("Друге за величиною a = " + a);

        }
        if ((a > c && c > b && c > d) || (b > c && c > a && c > d) || (d > c && c > b && c > a)){
            System.out.println("Друге за величиною c = " + c);

        }
        if ((a > d && d > b && d > c) || (b > d && d > a && d > c) || (c > d && d > b && d > a)){
            System.out.println("Друге за величиною d = " + d);

        }

        System.out.println("Операція порівняння закінчена");
    }
}