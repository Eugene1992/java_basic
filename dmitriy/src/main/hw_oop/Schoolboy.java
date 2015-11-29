
public class Schoolboy {

    String name;
    String surname;
    int assessment;

    public Schoolboy(String name, String surname, int assessment) {
        this.name = name;
        this.surname = surname;
        this.assessment = assessment;
    }

    public String toString() {
        return surname + " " + name + " отримає оцінку " + assessment;
    }
}


