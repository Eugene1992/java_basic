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

                System.out.print("Бінарний код числа " + a + " є ");
                StringBuilder c = new StringBuilder();
                do {
                    c.append(a % 2);
                    a = a / 8;
                } while (a != 0);
                System.out.println(c.reverse());
                break;

            case 3:
                //a = 125;
                //int counter = 0;

                int z = a / 16; // вираховуємо ціле число вираховуємо скільки 16-ток вміщається в числі а
                int x = 16 * z; // ціле число із сумми 16-ток що вміщається у значенні а
                int v = a - x; // залишок від віднімання. Різниця між а і х

                if (v <= 9) System.out.println(v);
                else {

 //                   abcdef(int );}


 //               public static void abcdef(int v){

                if (v == 10) {
                    v = 'A';
                    System.out.println((char) v);
                } else {
                    if (v == 11) {
                        v = (char) 'B';
                        System.out.println((char) v);
                    } else {
                        if (v == 12) {
                            v = (char) 'C';
                            System.out.println((char) v);
                        } else {
                            if (v == 13) {
                                v = (char) 'D';
                                System.out.println((char) v);
                            } else {
                                if (v == 14) {
                                    v = (char) 'E';
                                    System.out.println((char) v);
                                } else {
                                    if (v == 15) {
                                        v = (char) 'F';
                                        System.out.println((char) v);
                                    }
                                }
                            }
                        }
                    }
                }
            }


            if (z > 16) {
                a = z;
                z = a / 16; // вираховуємо ціле число вираховуємо скільки 16-ток вміщається в числі а
                x = 16 * b; // ціле число із сумми 16-ток що вміщається у значенні а
                v = a - x; // залишок від віднімання (13)
                System.out.print(v);
            }
            break;
            }
        }
    }







