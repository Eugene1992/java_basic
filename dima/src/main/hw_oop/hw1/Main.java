package hw1;


public class Main {
public static void main(String[] args){

    Student s1 = new Student(15, "Дима","Сахно");
    Student s2 = new Student(6, "Иван","Кабан");
    Student s3 = new Student(20, "Андре","Дурак");
    Student s4 = new Student(8, "Женя","Крутой");
    Student s5 = new Student(7, "Алла","Коновал");
    Student s6 = new Student(11, "Таня","Плохая");
    Student s7 = new Student(4, "Саша","Петров");
    Student s8 = new Student(6, "Дима","Иванов");
    Student s9 = new Student(5, "Ира","Ковальчук");
    Student s10 = new Student(8, "Катя","Сахно");

    Student[] studentsArray = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

    System.out.println("1--------------------Исходное состояние:--------------------------------");

    for (Student s : studentsArray) {
        System.out.println(s.toString() );
    }

    System.out.println("2-----------------------Четные оценки если я правильно понял задачу---------------------");
    for (Student s : studentsArray) {
        if(s.mark%2 ==0){
            System.out.println(s.toString() );
    }
    }

    System.out.println("3----------------------в обратном порядке---------------------------------");

    for (int i = studentsArray.length - 1; i >=0; i--) {
        System.out.println(studentsArray[i].toString());
    }
    System.out.println("4----------------------в певая половина---------------------------------");
    printArray(studentsArray,0, studentsArray.length/2);
    System.out.println("4----------------------в вторая половина---cvcvcvcv------------------------------");
    printArray(studentsArray,studentsArray.length/2,studentsArray.length);
    System.out.println("5----------------------в певая половина в обратном ----------------------");
    printArray(studentsArray,studentsArray.length/2,0);
    System.out.println("5----------------------в вторая половина в обратном----------------------");
    //printArray(studentsArray,studentsArray.length, studentsArray.length/2);

    System.out.println("6,7,8-------------Сумма-----мин макс середне-----99--------------------");

    int min=studentsArray[0].mark;
    int max=studentsArray[0].mark;
    int sum=0;

    for (Student s : studentsArray) {
        if(min<s.mark) min = s.mark;
        if(max>s.mark) max = s.mark;
        sum+=s.mark;
        sum+=s.mark;
    }
    System.out.println("  Сумма "+ sum +" мин "+ min +" макс "+max+" сред ар. "+sum/studentsArray.length);





}
    public static void printArray(Student[] sArray,int i1,int i2){
        int step;
        if(i1<i2) step = 1;
           else step =-1;

        for (int i = i1; i != i2; i+=step) {
            System.out.println(sArray[i].toString());

        }
    }

}
