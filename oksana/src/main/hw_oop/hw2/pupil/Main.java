package hw2.pupil;

import hw2.pupil.ClassRoom;
import hw2.pupil.Pupil;

/**
 * Created by Оксана on 03.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Pupil jack = new Pupil();
        ExcelentPupil kate = new ExcelentPupil();
        GoodPupil vova = new GoodPupil();
        BadPupil olya = new BadPupil();

        ClassRoom classRoom = new ClassRoom(jack,kate,vova,olya);

        for (Pupil curPupl : classRoom.pupils) {
            curPupl.study();
        }

        for (int i = 0; i < classRoom.pupils.length; i++) {
            classRoom.pupils[i].study();
        }

    }
}
