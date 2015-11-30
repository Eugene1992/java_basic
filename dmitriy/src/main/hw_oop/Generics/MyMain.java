package Generics;

import java.util.*;

//Задание 2
//        Создайте проект, используя IntelliJ IDEA.
//        Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
//        экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс
//        взаимодействия с экземпляром, должен включать метод добавления элемента, индексатор для
//        получения значения элемента по указанному индексу и свойство только для чтения, для получения
//        общего количества элементов.

class MyList<T> {

    public void add(T o) {
    }
}


class MyMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyList<ArrayList[]> myList = new MyList<>();
        int temp = 0;
        int counter = 0;
        String element;

        while (temp == 0) {

            System.out.print("Enter the number or E - ");
            element = sc.nextLine();
            if (element.equals("E") || element.equals("e")) {
                ++temp;
                break;
            } else ;
        }

        System.out.println("Enter the index number what you whant to get(" + ") - ");
        int index = sc.nextInt();
        System.out.println(myList);


    }
}

