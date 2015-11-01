package hw2;

/**
 * Created by IT on 01.11.2015.
 */
public class Pupil {
    private String name;
    public Pupil(String name){
        this.name = name;
    }


    public void Study(){
        System.out.println("Study "+getName());
    }

    public void Read(){
        System.out.println("Read "+getName());
    }
    public void Write(){
        System.out.println("Write "+getName());
    }

    public void Relax(){
        System.out.println("Relax "+getName());
    }

    public String getName() {
        return name;
    }
}
