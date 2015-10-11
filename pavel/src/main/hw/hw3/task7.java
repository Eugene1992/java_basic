package hw3;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by ppota on 10/11/2015.
 */
//Задание 7
//        Используя IntelliJ IDEA, создайте класс Calculator.
//        Напишите программу - консольный калькулятор.
//        Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения. Предложите
//        пользователю ввести знак арифметической операции. Примите значение введенное пользователем и поместите его в строковую
//        переменную sign. Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch. Выведите
//        на экран результат выполнения арифметической операции. В случае использования операции деления, организуйте проверку
//        попытки деления на ноль. И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
//        пользователя.


public class task7 {
    public static void main (String[] args){
        int operand1;
        int operand2;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        operand1 = sc.nextInt();
        System.out.println("Введите второе число:");
        operand2 = sc.nextInt();

        System.out.println("Введите знак операции:");
        String operation = sc.next();
        sc.close();


        switch(operation)
        {
            case "+": result = operand1 + operand2;
                break;
            case "-": result = operand1 - operand2;
                break;
            case "*": result = operand1 * operand2;
                break;
            case "/":
                if (operand1!=0&operand2!=0) result = operand1 / operand2;
                else
                System.out.println("Внимание!!! Ошибка деления / на 0");
                break;
        }
        System.out.println("Результат =  "+result);
    }

}




