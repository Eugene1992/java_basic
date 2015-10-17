package hw5;

/**
 * Created by Оксана on 15.10.2015.
 *
 * 2. Вывести все числа одномерного массива в обратном порядке
 *
 */
public class SecondTask {
    public static void main(String[] args)  {
        int mass[] = new int[100];
        for (int i=1; i<100; i++) {
            mass[i] = (i*2)-1;
        }
        for (int i=1; i<mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i=100; i<mass.length; i--){
            System.out.print(mass[i] + " ");
        }


    }
}
