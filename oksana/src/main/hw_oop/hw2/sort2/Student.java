package hw2.sort2;

import java.util.*;

/**
 * Created by Оксана on 26.10.2015.
 */

class Student {
    private String name;
    private String surname;
    private Integer mark;

    Student(String n, String w, int g) {
        name = n;
        surname = w;
        mark = g;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + mark;
    }
}

class SortExamples {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Petr", "Second", 9);
        students[1] = new Student("Napoleon", "Solo", 10);
        students[2] = new Student("Ivan", "Groznuy", 5);
        students[3] = new Student("Faust", "Johan", 12);
        students[4] = new Student("Oleg", "Gusev", 8);


        System.out.println("Unsorted:");
        for (Student p : students)
            System.out.println(p);


        //Застосування метода sort() класа Arrays, використовуємо оскільки массив вже заповнений значеннями

       // Самосортуючі структури данних мають ефективність O(log(n)), що краще, чем O(n).  при подвоєнні кількості
        // данних в коллекції час пошуку збільшується на певну константу
        // ми використовуємо java.util.*; а саме java.util.Comparator
        //  створення інтерфейсу компаратор сортування за іменем
        // мені писати що таке інтерфейс???
        // ми порівнюємо 2 обєкти  Student a, Student b
        // аналогічні викладки можна застосувати і до числових значень, тобто оцінки, також існує інтерфейст комперибл,
        // але оскільки сортування проводиться за 2 параметрами (можна було б і за 3, але сенсу не бачу в данній задачі),
        // то більш доцільно використати компаратор, оскільки його можна застосувати до декількох параметрів

        //спеціальний додаток, на відміну від іквелс, компеар ту внаслідок порівняння може вивести 3 типа результатів
        // 0, якщо обєкти рівні, - якщо обєкт менше параматра + якщо обєкт більше параметра
        // аналогічні що до викладок при застосуванні іквелс ( тру фолс)
        // . - оскільки строкові данні не можна порівняти за величиною?


        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.getName().compareTo(b.getName());
            }
        });
        System.out.println("\nSorted by name:");
        for (Student p : students)
            System.out.println(p);

        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.getMark() - b.getMark();
            }
        });


        System.out.println("\nSorted by mark:");
        for (Student p : students)
            System.out.println(p);
    }
}
