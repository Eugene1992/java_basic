package Generics;

import java.util.*;

//Задание 2
//        Создайте проект, используя IntelliJ IDEA.
//        Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
//        экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс
//        взаимодействия с экземпляром, должен включать метод добавления элемента, индексатор для
//        получения значения элемента по указанному индексу и свойство только для чтения, для получения
//        общего количества элементов.

class MyList<T> implements List<T>{

    private T temp;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}


class MyMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyList<String> myList = new MyList<>();
        int temp = 0;
        int counter = 0;
        String element;

        while (temp == 0) {

            System.out.print("Enter the number or E - ");
            element = sc.nextLine();
            if (element.equals("E") || element.equals("e")) {
                ++temp;
                break;
            } else myList.add(element);
        }

        System.out.println("Enter the index number what you whant to get(" + ") - ");
        int index = sc.nextInt();
        System.out.println(myList.get(index));


    }
}

