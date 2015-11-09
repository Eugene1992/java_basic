package Pupil;

public class Test {
    public static void main(String[] args) {

        Pupil oksens = new Pupil();
        ExcelentPupil pavel = new ExcelentPupil();
        ExcelentPupil dima = new ExcelentPupil();

        ClassRoom classRoom = new ClassRoom(pavel, dima, oksens);

   for (Pupil curPupl : classRoom.pupils) {
        curPupl.stud();
       }

        for (int i = 0; i < classRoom.pupils.length; i++) {
            classRoom.pupils[i].stud();
        }

    }
}
