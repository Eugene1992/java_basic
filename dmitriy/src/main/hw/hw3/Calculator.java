package hw3;
import java.util.Scanner;
/**
 * Задание 7
 *Используя IntelliJ IDEA, создайте класс Calculator.
 *Напишите программу - консольный калькулятор.
*
 *Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения. Предложите
 *пользователю ввести знак арифметической операции. Примите значение введенное пользователем и поместите его в строковую
 *переменную sign.
 * Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch. Выведите
 *на экран результат выполнения арифметической операции. В случае использования операции деления, организуйте проверку
 *попытки деления на ноль. И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 *пользователя.
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Вас вітає калькулятор введіть будьласка перше число");
        double operant1 = myScanner.nextDouble();

        System.out.println("Введіть друге число");
        double operant2 = myScanner.nextDouble();

        System.out.println("Введіть одну з дій (  + ;  - ;  * ;  / )");
        String s = myScanner.next();

        switch(s) {

            case "+":
                double sum = operant1 + operant2;
                System.out.println("Сумма двох значень" + operant1 + " і " + operant2 + " дорівнює = " + sum);
                break;
            case "-":
                double difference = operant1 - operant2;
                System.out.println("Різниця двох значень" + operant1 + " і " + operant2 + " дорівнює = " + difference);
                break;
            case "*":
                double multiplication = operant1 * operant2;
                System.out.println("Наслідок множення двох значень" + operant1 + " і " + operant2 + " дорівнює = " + multiplication);
                break;
            case "/":
                double division = operant1 / operant2;
                if (division == 0) {
                    System.out.println("Наслідком діленняна о буде" + operant1);
                } else {
                    System.out.println("Наслідок ділення двох значень" + operant1 + " на " + operant2 + " дорівнює = " + division);
                }
            default:
                System.out.println("Помилка внесення!");
        }
    }
}
