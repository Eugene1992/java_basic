package hw2;

/**
 * Created by IT on 01.11.2015.
 */
public class Main2 {


    public static void main(String[] args) {

        ExcelentPupil pupilAndrey  = new ExcelentPupil("Andrey");
        BadPupil      pupilDima    = new BadPupil("Dima");
        GoodPupil     pupilVany    = new GoodPupil("Vany");
        ExcelentPupil pupilNatasha = new ExcelentPupil("Natasha");

       ClassRoom  classA = new ClassRoom(pupilAndrey, pupilDima, pupilNatasha);
       ClassRoom  classB = new ClassRoom(pupilAndrey, pupilDima, pupilNatasha, pupilVany);

       classA.PupilsRead();
       classA.PupilsRelax();
       classA.PupilsStudy();
       classA.PupilsWrite();
    }
}
