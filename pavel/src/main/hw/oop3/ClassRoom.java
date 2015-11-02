package oop3;

/**
 * Created by ppota on 11/2/2015.
 */
public class ClassRoom {
    Pupil[] pupils;

    public ClassRoom (Pupil pupilOne, Pupil pupilTwo, Pupil pupilThree) {
        pupils = new Pupil[3];
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
        pupils[2] = pupilThree;

    }

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo) {
        pupils = new Pupil[2];
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
    }
}
