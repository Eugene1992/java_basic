package hw3;

public class Hw1 {
    public static void main(String[] args){

     /**   Задание 1
        Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
        Выполните и рассчитайте результат следующих операций для этих переменных:

        x += y - x++ * z;
        z = --x – y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
*/

        int x = 10;
        int y = 12;
        int z = 3;


        x += y - x++ * z;
        System.out.println(x);
        z = y * 5 - --x;
        System.out.println(z);
        y /= x + 5 % z;
        System.out.println(y);
        z = x++ + y * 5;
        System.out.println(z);
        x = y - (x++) * z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);







    }
}
