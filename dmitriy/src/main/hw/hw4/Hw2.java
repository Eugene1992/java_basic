package hw4;
import java.util.Scanner; // импортируем класс
/**
 * -------------------------------------------------- Системы счисления ---------------------------------------------------
 6. Написать программу, которая реализует следующий функционал:
 6.1 Пользователь вводит число в 10-ой системе счисления.
 6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
 1) в 2-ую
 2) в 8-ую
 3) в 16-ую
 6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
 на экран результат.
 */
public class Hw2 {
    public static void main(String[] args) {

        System.out.print("Введіть ціле число (у 10-ній системі) що буде переведено - ");

        Scanner myScanner = new Scanner(System.in);

        int a = myScanner.nextInt(); // Число котре введене з клавіатури і буде переводитися в іншу систему

        System.out.println("Вкажіть (числом 1;2;3) в яку систему перевести число: ");
        System.out.println("1 - 2-во значну");
        System.out.println("2 - 8-и значну");
        System.out.println("3 - 16-ти значну");

        byte b = myScanner.nextByte();

        switch (b) {
            case 1:

                System.out.print("Бінарний код числа " + a + " є ");
                StringBuilder sb = new StringBuilder();

                do {
                    sb.append(a % 2);
                    a = a / 2;
                } while (a != 0);
                System.out.println(sb.reverse());
                break;

            case 2:

                System.out.print("Код у 8-ми значній системі числа " + a + " є ");

                StringBuilder c = new StringBuilder();

                do {
                    c.append(a % 2);
                    a = a / 8;
                } while (a != 0);
                System.out.println(c.reverse());
                break;

            case 3:

                System.out.print("Код у 16-ти значній системі числа " + a + " є ");
                System.out.println(Integer.toString(a, 16));
            }
        }
    }







