package hw1;

/**
 * Задание 2
 *Используя IntelliJ IDEA, создайте класс arithmeticAverage .
 *Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
 *С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного отображения результата?
 */
public class ArithmeticAverage {
    public static void main(String[] args) {

        byte a = 5;
        byte b = 6;
        byte c = 7;
        int midle = 0;

        midle = (a + b +c)/3;

        System.out.print(midle);
    }
}
