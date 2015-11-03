package Pupil;


public class ClassRoom {
    Pupil[] pupils;

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo){
        pupils = new Pupil[2];
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
    }

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo, Pupil pupilThree){
        pupils  = new Pupil[3];
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
        pupils[2] = pupilThree;
    }
}
