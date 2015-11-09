package hw3;
/**Задание 2
 Используя IntelliJ IDEA, создайте класс arithmeticAverage .
 Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
 С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного отображения результата?
 */
public class Hw2 {
    public static void main(String[] args){

        int a = 10;
        int b = 12;
        int c = 15;
        double midle = (double)(a + b + c) / 3;

        System.out.println(midle);
    }
}
