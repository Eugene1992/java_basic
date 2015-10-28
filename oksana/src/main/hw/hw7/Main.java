package hw7;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.subtractExact;

/**
 * Created by Оксана on 26.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        double sum = 0;

        Student nameStudentOne = new Student();
        nameStudentOne.name = " Kate";
        nameStudentOne.sername = " Ivanova";
        nameStudentOne.mark = 12;

        Student nameStudentSecond = new Student();
        nameStudentSecond.name = " Oleg";
        nameStudentSecond.sername = " Ivanov";
        nameStudentSecond.mark = 7;

        Student nameStudentThird = new Student();
        nameStudentThird.name = " Ira";
        nameStudentThird.sername = " Belkina";
        nameStudentThird.mark = 11;

        Student vika = new Student();
        vika.name = " Vika";
        vika.sername = " Sinchugova";
        vika.mark = 11;

        Student artem = new Student();
        artem.name = " Artem ";
        artem.sername = " Usenko ";
        artem.mark = 9;


        Student[] students = new Student[5];
        for (int i = 0; i < 5; ++i) {
            students[0] = nameStudentOne;
            students[1] = nameStudentSecond;
            students[2] = nameStudentThird;
            students[3] = vika;
            students[4] = artem;
            System.out.println(students[i]);


        }
        double average = sum / students.length;
        ;
        double average1 = sum / (students.length / 2);
        double average2 = sum / (students.length - students.length / 2);
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of task");
        int task = read.nextInt();
        switch (task) {
            case 1:
                //Вывести в консоль все парные оценки обьектов массива.

                for (int i = 0; i < 5; i++) {
                    if ((students[i].mark % 2 == 0)) {
                        System.out.print(" " + students[i].mark);
                    }
                }
                System.out.println("");

                break;
            case 2:
                //Вывести все оценки обьектов массива в обратном порядке.

                for (int i = (students.length - 1); i >= 0; --i) {
                    System.out.println(" " + students[i].mark);
                }


                break;
            case 3:
                // Вывести первую и вторую половину оценок массива обьектов.


                for (int i = 0; i < (students.length) / 2; i++) {
                    System.out.print(" " + students[i].mark);
                }
                System.out.println(" ");
                for (int i = ((students.length) / 2); i < (students.length); i++) {
                    System.out.print(" " + students[i].mark);
                }
                System.out.println("");

                break;
            case 4:
                //Вывести первую и вторую половину оценок массива обьектов в обратном порядке.
                for (int i = (students.length - 1); i >= (students.length) / 2; --i) {
                    System.out.print(" " + students[i].mark);

                }
                System.out.println("");
                for (int i = ((students.length / 2 - 1)); i >= 0; --i) {
                    System.out.print(" " + students[i].mark);
                }
                System.out.println("");

                break;
            case 5:
                // Найти минимальную и максимальную оценку в массиве обьектов.
                for (int i = 0; i < students.length; i++) {
                    int min = students[i].mark;
                    int min_i = i;
                    for (int j = i + 1; j < students.length; j++) {
                        if (students[j].mark < min) {
                            min = students[j].mark;
                            min_i = j;
                        }

                    }
                    if (i != min_i) {
                        int tmp = students[i].mark;
                        students[i].mark = students[min_i].mark;
                        students[min_i].mark = tmp;
                    }
                }
                System.out.println("Min " + students[0].mark);
                System.out.println("Max " + students[4].mark);

                break;
            case 6:
                //Заменить все парные оценки в массиве обьектов на 0.
                for (int i = 0; i < students.length; i++) {
                    if ((students[i].mark % 2 == 0)) {
                        students[i].mark = 0;
                    }
                    System.out.println("" + students[i].mark);
                }
                System.out.println("");
                break;
            case 7:
                //Вывести на печать все оценки обьектов с индексом меньше 3 включительно.
                for (int i = 0; i <= 3; i++) {
                    System.out.println(students[i].mark);
                }
                break;
            case 8:
                //Найти и вывести сумму всех оценок обьектов массива.

                for (int i = 0; i < students.length; i++) {
                    sum = sum + students[i].mark;
                }
                System.out.println("Sum =" + sum);

                break;
            case 9:
                // Найти среднеарифметическое всех оценок обьектов массива.

                for (int i = 0; i < students.length; i++) {
                    sum = sum + students[i].mark;
                    average = sum / students.length;
                }
                System.out.println("avarage =" + average);

                break;
            case 10:
                //11. Поменять минимальную и максимальную оценки в массиве обьектов местами.
                for (int i = 0; i < students.length; i++) {
                    int min = students[i].mark;
                    int min_i = i;
                    for (int j = i + 1; j < students.length; j++) {
                        if (students[j].mark < min) {
                            min = students[j].mark;
                            min_i = j;
                        }

                    }
                    if (i != min_i) {
                        int tmp = students[i].mark;
                        students[i].mark = students[min_i].mark;
                        students[min_i].mark = tmp;
                    }
                    int a;
                    a = students[0].mark;
                    students[0].mark = students[4].mark;
                    students[4].mark = a;
                    System.out.println(students[i].mark);
                }
                break;
            case 11:
                // 12. Вывести в консоль половину оценок массива обьектов, среднеарифметическое оценок которых является наибольшим.
                for (int i = 0; i < students.length / 2; i++) {
                    sum = sum + students[i].mark;
                    average1 = sum / (students.length / 2);
                }
                for (int i = students.length / 2; i < students.length; i++) {
                    sum = sum + students[i].mark;
                    average2 = sum / (students.length - students.length / 2);
                }
                if (average1 > average2) {
                    for (int i = 0; i < students.length / 2; i++) {
                        System.out.println(students[i].mark);
                    }
                } else {
                    for (int i = students.length / 2; i < students.length; i++) {
                        System.out.println(students[i].mark);
                    }
                }
                break;
            case 12:
                // 13. Найти индексы положительных оценок(которые > 8) и сумму негативных оценок(которые < 8) в массиве обьектов
                for (int i = 0; i < students.length; i++) {
                    if (students[i].mark > 8) {
                        students[i].mark = i;
                        System.out.println(">8 " + i);
                    } else {
                        System.out.println("<8 " + i);
                    }
                }
                break;
            case 13:
                //Поменять местами две наибольшие оценки с первой и последней оценками в массивеобьектов.


                break;
            case 14:
                // Вывести на экран оценки массива обьектов, которые расположены до минимальной оценки обьекта в массиве.

                int b = 0;
                for (int i = 0; i < students.length; ++i) {
                    if (students[b].mark > students[i].mark) b = i;
                }
                for (int i = 0; i <= b; i++) {
                    System.out.println(students[i].mark);

                }
                break;
            case 15:
                // Найти сумму всех оценок находящихся между минимальной и максимальной оценками в массиве обьектов.
                int c = 0;
                int d = 0;
                for (int i = 0; i < students.length; ++i) {
                    if (students[c].mark > students[i].mark) c = i;
                    if (students[d].mark < students[i].mark) d = i;
                }
                for (int i = c; i <= d ; i++) {
                    System.out.println(students[i].mark);

                }


                break;
            case 16:
                break;


            default:
                System.out.println("?");


        }
    }
}






