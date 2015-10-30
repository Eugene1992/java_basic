package hw1;


public class Student {
    int mark;
    String name;
    String surname;

    public Student(int mark, String name, String surname) {
        this.mark = mark;
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return "Имя: " + name + " Фаминиля: " + surname +" Оценка: " + mark;
    }

 }
