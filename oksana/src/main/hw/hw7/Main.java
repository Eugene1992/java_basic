package hw7;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by Оксана on 26.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Student nameStudentOne = new Student();
        nameStudentOne.name = "Kate";
        nameStudentOne.sername = "Ivanova";
        nameStudentOne.mark = 10;

        Student nameStudentSecond = new Student();
        nameStudentSecond.name = "Oleg";
        nameStudentSecond.sername = "Ivanov";
        nameStudentSecond.mark = 7;

        Student nameStudentThird = new Student();
        nameStudentThird.name = "Ira";
        nameStudentThird.sername = "Belkina";
        nameStudentThird.mark = 11;

        Student vika = new Student();
        vika.name = "Vika";
        vika.sername = "Sinchugova";
        vika.mark = 12;

        Student artem = new Student();
        artem.name = "Artem";
        artem.sername = "Usenko";
        artem.mark = 9;

        int[] arr= {vika.mark,artem.mark, nameStudentOne.mark, nameStudentSecond.mark, nameStudentThird.mark};

            int mn, mx;
            mn = mx = arr[0];
            for (int i = 0; i < arr.length; ++i) {
                mn = min(mn, arr[i]);
                mx = max(mx, arr[i]);
            }
        System.out.println("Min"+mn);
        System.out.println("Max"+mx);


        }

    }

