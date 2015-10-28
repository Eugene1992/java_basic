package hw7;


import java.util.Arrays;

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

        // Найти минимальную и максимальную оценку в массиве обьектов.
        for (int i = 0; i <students.length ; i++) {
            int min = students[i].mark;
            int min_i = i;
            for (int j = i+1; j <students.length ; j++) {
                if(students[j].mark <min){
                    min = students[j].mark;
                    min_i=j;
                }

            }
            if ( i != min_i){
                int tmp = students[i].mark;
                students[i].mark = students[min_i].mark;
                students[min_i].mark = tmp;
            }
        }
        System.out.println("Min "+students[0].mark );
        System.out.println("Max "+students[4].mark );


        //Заменить все парные оценки в массиве обьектов на 0.
        for (int i = 0; i < students.length; i++) {


            if ((students[i].mark % 2 == 0)) {
                students[i].mark = 0;
            }
            System.out.println("" + students[i].mark);
        }
        System.out.println("");



    }
}






