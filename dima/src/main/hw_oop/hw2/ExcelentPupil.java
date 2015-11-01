package hw2;

/**
 * Created by IT on 01.11.2015.
 */
public class ExcelentPupil extends Pupil {
    public ExcelentPupil(String name) {
        super(name);
    }

    @Override
    public void Read() {
        System.out.println("Excelent read "+getName());
    }

    @Override
    public void Study() {
        System.out.println("Excelent study "+getName());
    }

    @Override
    public void Write() {
        System.out.println("Excelent write "+getName());
    }

    @Override
    public void Relax() {
        System.out.println("Excelent relax "+getName());
    }
}
