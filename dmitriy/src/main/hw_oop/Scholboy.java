
public class Scholboy {

    String name;
    String surname;
    int assessment;

    public Scholboy(String name, String surname, int assessment){
        this.name = name;
        this.surname = surname;
        this.assessment = assessment;
    }

    public String toString(){
       return surname + " " + name + " отримає оцінку " + assessment;
    }

}
