package hw7;

/**
 * Created by Оксана on 26.10.2015.
 */
public class Student {
    String name;
    String sername;
    int mark;

    public Student() {
        String name;
        String sername;
        int mark;
    }

    public Student(String name, String sername, int mark) {
        this.name = name;
        this.sername = sername;
        this.mark = mark;
    }
    public String toString(){return sername + " " + name + " отримає оцінку " +mark;
    }




}
