package Calculator;

import java.util.Scanner;

/**
 * Задание
 * Создайте проект, используя IntelliJ IDEA.
 * Создайте класс Calculator.
 * В теле класса создайте четыре метода для арифметических действий: (Add – сложение, Sub – вычитание,
 * Mul – умножение, Div – деление).
 * Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
 * исключение.
 * Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию.
 * При возникновении ошибок должны выбрасываться исключения.
 */
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number end action (the gap between the values)");

        Calculator calculator = new Calculator();

        calculator.setA(scanner.nextDouble());
        calculator.setAction(scanner.next());
        calculator.setB(scanner.nextDouble());

        switch (calculator.getAction()){
            case "+":
                System.out.println(calculator.add(calculator.getA(), calculator.getB()));
                break;
            case "-":
                System.out.println(calculator.sub(calculator.getA(), calculator.getB()));
                break;
            case "*":
                System.out.println(calculator.mul(calculator.getA(), calculator.getB()));
                break;
            case "/":
                System.out.println(calculator.div(calculator.getA(), calculator.getB()));
                break;
            default:
                System.out.println("Fuck!");
        }
    }
}
