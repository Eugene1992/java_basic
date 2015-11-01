package hw2;

/**
 * Created by IT on 01.11.2015.
 */
public class ClassRoom {
    static private Pupil[] pupils = new Pupil[4];



    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        pupils[3] = pupil4;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2){
        pupils[0] = pupil1;
        pupils[1] = pupil2;
    }

    public void  PupilsWrite(){
        for (Pupil pupil : pupils) {
            if(pupil !=null){
                pupil.Write();
    }}}

    public void  PupilsStudy(){
        for (Pupil pupil : pupils) {
            if(pupil !=null){
                pupil.Study();
            }}}
    public void  PupilsRead(){
        for (Pupil pupil : pupils) {
            if(pupil !=null){
                pupil.Read();
            }}}

    public void  PupilsRelax(){
        for (Pupil pupil : pupils) {
            if(pupil !=null){
                pupil.Relax();
            }}}

}
