package hw2;

/**
 * Created by IT on 01.11.2015.
 */
public class BadPupil extends Pupil {

    public BadPupil(String name) {
        super(name);
    }

    @Override
    public void Read() {
        System.out.println("Bad read "+getName());
    }

    @Override
    public void Study() {
        System.out.println("Bad study "+getName());
    }

    @Override
    public void Write() {
        System.out.println("Bad write "+getName());
    }

    @Override
    public void Relax() {
        System.out.println("Bad relax "+getName());
    }
}
