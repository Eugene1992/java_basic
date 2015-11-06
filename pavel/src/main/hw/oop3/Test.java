package oop3;

/**
 * Created by ppota on 11/2/2015.
 */
public class Test {
    public static void main (String[] args){
        BadPupil Oksana = new BadPupil();
        Pupil Pavel = new Pupil();
        ExtendedPupil Dima = new ExtendedPupil();

        ClassRoom classRoom = new ClassRoom(Pavel, Dima, Oksana);

        for (Pupil curPupil : classRoom.pupils){
            curPupil.study();
        }

    }
}
