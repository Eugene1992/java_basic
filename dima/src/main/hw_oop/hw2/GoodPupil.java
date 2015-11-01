package hw2;

/**
 * Created by IT on 01.11.2015.
 */
public class GoodPupil extends Pupil{
    public GoodPupil(String name) {
        super(name);
    }

    @Override
    public void Relax() {
        System.out.println("Good relax");
    }

    @Override
    public void Write() {
        System.out.println("Good write");
    }

    @Override
    public void Study() {
        System.out.println("Good study");
    }

    @Override
    public void Read() {
        System.out.println("Good read");
    }
}
