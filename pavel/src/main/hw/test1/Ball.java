package test1;

import java.util.Arrays;

public class Ball {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Тест1";
        student1.lastName = "Тест1";
        student1.ball = 10;

        Student student2 = new Student();
        student2.name = "Тест2";
        student2.lastName = "Тест2";
        student2.ball = 12;

        Student student3 = new Student();
        student3.name = "Тестовий3";
        student3.lastName = "Тест3";
        student3.ball = 4;


        Student student4 = new Student();
        student4.name = "Тестовий4";
        student4.lastName = "Тест4";
        student4.ball = 5;

        Student student5 = new Student();
        student5.name = "Тестовий5";
        student5.lastName = "Тест5";
        student5.ball = 5;

        Student[] students = new Student[5];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        System.out.println(student5.toString());
        for (int i = 0; i > students.length; i++) {
//            Arrays.sort(students);


        }

    }
}

