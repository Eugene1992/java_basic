package hw6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Оксана on 24.10.2015.
 * -------------------------------------------------------- Методы --------------------------------------------------------
 1. В методе main создайте массив строк emptyPlaylist произвольной длины.
 2. Создайте метод fillThePlaylist, который принимает на вход массив строк, который нужно заполнить, и возвращает его
 после заполнения.
 3. Реализуйте логику метода fillThePlaylist - cсвоих любимых музыкальных композиций.
 4. Создайте метод getRandomSongs, который принимает на вход массив строк и число случайно выбранных элементов из массива.
 5. Реализуйте логику метода getRandomSongs - выбор заданного числа случайных строк из полученного массива. Сгенерируйте
 заданное количество строк и выведите в консоль эти строки.
 6. В методе main вызовите метод getRandomSongs, во входящие параметры которого передайте результат выплнения метода
 fillThePlaylist и целочисленное значение. На забывайте, что метод fillThePlaylist также имеет входящий параметр.
 7. Результат выполнения - в консоль выводиться заданное количество случайно выбранных строк из сформированного Вами массива
 вашых любимых музыкальный композиций.
 8. Обратите внимание на конструкцию вызова вложенных методов, проанализируйте, что возвращает каждый из них как они взаимодействуют.
 9. Послушайте песенки и возрадуйтесь :)
 ------------------------------------------------------------------------------------------------------------------------
 */
public class Tasks {
    public static void main(String[] args) {
        ArrayList emptyPlaylist = new ArrayList();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of task");
        int task = read.nextInt();
        switch (task) {
            case 1:
                System.out.println(fillThePlaylist(emptyPlaylist));
                break;
            case 2:
                System.out.println(fillThePlayListSecond(fillThePlaylist(emptyPlaylist)));
                break;
            default:
                System.out.println("?");
        }
    }


    public static ArrayList fillThePlaylist(ArrayList emptyPlaylist) {
        ArrayList<String> fillThePlaylist = new ArrayList();
        fillThePlaylist.add("Radiohead -Creep");
        fillThePlaylist.add("The XX - Together");
        fillThePlaylist.add("Gavin De Graw- Just Friends");
        fillThePlaylist.add("Shinedown-Her name is Alice ");
        fillThePlaylist.add("The Weeknd-The Hils");


        return fillThePlaylist;
    }

    public static ArrayList fillThePlayListSecond(ArrayList emptyPlaylist) {
        ArrayList<String> fillThePlaylist = new ArrayList();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        fillThePlaylist.add(s);
        System.out.println(fillThePlaylist);
        return fillThePlayListSecond(fillThePlaylist);
    }


}


