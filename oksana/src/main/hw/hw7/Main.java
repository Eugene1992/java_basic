package hw7;


import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by Оксана on 26.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        double sum = 0;

        Student nameStudentOne = new Student();
        nameStudentOne.name = " Kate";
        nameStudentOne.sername = " Ivanova";
        nameStudentOne.mark = 6;

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

        //Вывести в консоль все парные оценки обьектов массива.

        for (int i = 0; i < 5; i++) {
            if ((students[i].mark % 2 == 0)) {
                System.out.print(" " + students[i].mark);
            }
        }
        System.out.println("");

        //Вывести все оценки обьектов массива в обратном порядке.

        for (int i = (students.length - 1); i >= 0; --i) {
            System.out.println(" " + students[i].mark);
        }

        // Вывести первую и вторую половину оценок массива обьектов.


        for (int i = 0; i < (students.length) / 2; i++) {
            System.out.print(" " + students[i].mark);
        }
        System.out.println(" ");
        for (int i = ((students.length) / 2); i < (students.length); i++) {
            System.out.print(" " + students[i].mark);
        }
        System.out.println("");

        //Вывести первую и вторую половину оценок массива обьектов в обратном порядке.
        for (int i = (students.length - 1); i >= (students.length) / 2; --i) {
            System.out.print(" " + students[i].mark);

        }
        System.out.println("");
        for (int i = ((students.length / 2 - 1)); i >= 0; --i) {
            System.out.print(" " + students[i].mark);
        }
        System.out.println("");

        //Найти и вывести сумму всех оценок обьектов массива.

        for (int i = 0; i < students.length; i++) {
            sum = sum + students[i].mark;
            System.out.println("Sum =" + sum);
        }
        System.out.println("");

        // Найти среднеарифметическое всех оценок обьектов массива.

        for (int i = 0; i < students.length; i++) {
            sum = sum + students[i].mark;
            double average = sum / students.length;
            System.out.println("avarage =" + average);
        }


        System.out.println("");


        //Заменить все парные оценки в массиве обьектов на 0.
        for (int i = 0; i < students.length; i++) {

            if ((students[i].mark % 2 == 0)) {
                students[i].mark = 0;
            }
            System.out.println("" + students[i].mark);
        }
        System.out.println("");

        //Найти минимальную и максимальную оценку в массиве обьектов

        for (int i = 0; i < students.length; ++i) ;
        int min, max;
        min = max = students[0].mark;

        for (int i = 0; i < students.length; ++i) {
            min = min(min, students[i].mark);
            max = max(max, students[i].mark);

        }
        System.out.print("Max and min elements  ");
        System.out.println(max + " " + min);


        // Подсчитать и вывести в консоль одинаковые оценки в массиве обьектов.


        // Найти индексы положительных оценок(которые > 8) и сумму негативных оценок(которые < 8) в массиве обьектов.
        for (int i = 0; i < 5; i++) {
            if ((students[i].mark >= 8)) {
                System.out.println("> 8 ");
                System.out.println(" " + students[i].mark);
            } else {
                System.out.println("< 8");
                System.out.println(" " + students[i].mark);
            }
        }
        System.out.println("");

        //Вывести на печать все оценки обьектов с индексом меньше 3 включительно.
        for (int i = 0; i <= 3; i++) {
            System.out.println(students[i].mark);

        }

        //Написать метод, который перемещает в конец массива все элементы, значения которых находится в отрезке [3,8].
        for (int i = 0; i < students.length; i++) {
            if (i >= 3 & i <= 8) {

            }


        }
    }
}






