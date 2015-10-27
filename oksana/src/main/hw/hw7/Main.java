package hw7;


/**
 * Created by Оксана on 26.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Student nameStudentOne = new Student();
        nameStudentOne.name = " Kate";
        nameStudentOne.sername = " Ivanova";
        nameStudentOne.mark = 10;

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
        vika.mark = 12;

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

        for (int i = 0; i < 5; i++) {
            if ((students[i].mark % 2 == 0)) {
                System.out.print(" " + students[i].mark);
            }
        }
        System.out.println("");

        for (int i = (students.length - 1); i >= 0; --i) {
            System.out.println(" " + students[i]);

        }


    }


}






