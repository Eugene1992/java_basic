package hw2;

/**
 * Created by IT on 01.11.2015.
 */
public class Main2 {
    static {
        pupilAndrey = new ExcelentPupil("Andrey");
        pupilDima = new BadPupil("Dima");
        pupilVany = new GoodPupil("Vany");
        pupilNatasha = new ExcelentPupil("Natasha");
    }

    static ExcelentPupil pupilAndrey;
    static BadPupil pupilDima;
    static GoodPupil pupilVany;
    static ExcelentPupil pupilNatasha;

    public static void main(String[] args) {

        ClassRoom  classA = new ClassRoom(pupilAndrey, pupilDima, pupilNatasha);
        ClassRoom  classB = new ClassRoom(pupilAndrey, pupilDima, pupilNatasha, pupilVany);

        classA.PupilsRead();
        classA.PupilsRelax();
        classA.PupilsStudy();
        classA.PupilsWrite();
    }

}
