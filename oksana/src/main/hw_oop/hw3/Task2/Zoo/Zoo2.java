package hw3.Task2.Zoo;

import java.util.ArrayList;

/**
 * Created by Оксана on 09.11.2015.
 */
public class Zoo2 {
    public static void main(String[] args) {
        ArrayList zooList = new ArrayList();
        zooList.add(0, "Cat");
        zooList.add(1, "Dog");
        zooList.add(2, "Cow");
        zooList.add(3, "Mouse");
        zooList.add(4, "Pig");
        zooList.add(5, "Lion");
        zooList.add(6, "Hipo");
        zooList.add(7, "Tiger");
        zooList.remove(7);
        zooList.remove(4);
        zooList.remove(1);
        System.out.println(zooList);
        System.out.println(zooList.size());


    }
}
