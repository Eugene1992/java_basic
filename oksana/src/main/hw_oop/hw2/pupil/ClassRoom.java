package hw2.pupil;

/**
 * Created by Оксана on 31.10.2015.
 */
public class ClassRoom {
    Pupil[] pupils;

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo){
        pupils = new Pupil[2];
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
    }

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo, Pupil pupilThree,Pupil pupilFour){
        pupils  = new Pupil[4];
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
        pupils[2] = pupilThree;
        pupils[3] = pupilFour;
    }
}
