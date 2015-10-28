package hw_oop;

public class Main {

    public static void main(String[] args) {
        Schoolboy student1 = new Schoolboy();
        student1.name = "Тест1";
        student1.lastName = "Тест1";
        student1.ball = 1;

        Schoolboy student2 = new Schoolboy();
        student2.name = "Тест2";
        student2.lastName = "Тест2";
        student2.ball = 2;

        Schoolboy student3 = new Schoolboy();
        student3.name = "Тестовий3";
        student3.lastName = "Тест3";
        student3.ball = 3;


        Schoolboy student4 = new Schoolboy();
        student4.name = "Тестовий4";
        student4.lastName = "Тест4";
        student4.ball = 4;

        Schoolboy student5 = new Schoolboy();
        student5.name = "Тестовий5";
        student5.lastName = "Тест5";
        student5.ball = 5;

        Schoolboy student6 = new Schoolboy();
        student5.name = "Тестовий6";
        student5.lastName = "Тест6";
        student5.ball = 6;

        Schoolboy student7 = new Schoolboy();
        student5.name = "Тестовий7";
        student5.lastName = "Тест7";
        student5.ball = 7;

        Schoolboy student8 = new Schoolboy();
        student5.name = "Тестовий8";
        student5.lastName = "Тест8";
        student5.ball = 8;

        Schoolboy student9 = new Schoolboy();
        student5.name = "Тестовий9";
        student5.lastName = "Тест9";
        student5.ball = 9;

        Schoolboy student10 = new Schoolboy();
        student5.name = "Тестовий10";
        student5.lastName = "Тест10";
        student5.ball = 10;

        Schoolboy[] students = new Schoolboy[11];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;
        students[8] = student9;
        students[10] = student10;
//
//        System.out.println(student1.ball);
//        System.out.println(student2.ball);
//        System.out.println(student3.ball);


        bubbleSort(students);

    }

    public static void bubbleSort(Schoolboy[] Students) {
        for (int i = Students.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Students[j].ball > Students[j + 1].ball) {
                    double ball = Students[j].ball;
                    Students[j].ball = Students[j + 1].ball;
                    Students[j + 1].ball = ball;
                    System.out.println(" " + ball);
                }
            }
        }
    }
}



















