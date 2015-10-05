package lesson3;

/**
 * Created by WebCamp on 01.07.2015.
 */
public class C04_MathPow {

    /* Math.pow() - возведение числа в степень
     * 1-ый аргумент - число, которое возводим в степень,
     * 2-ой – показатель степени, в которую возводим число.
     */

    public static void main(String[] args) {

        double x = 2, y = 8;

        double result = Math.pow(x, y);

        System.out.println(result);

    }
}
