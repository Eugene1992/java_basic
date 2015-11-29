package Car3;
/**
 Задание 4
 Используя Intelij IDEA создать проект, пакет.
 (Заново!) Создать класс Машина с полями год(int),скорость(double), вес(int) цвет(String).
 Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
 Перегрузить конструкторы вызывая конструктор из конструктора.
 Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
 */
public class Car3 {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car3(int year){this.year = year;}
    public Car3(int year, double speed){this(year); this.speed = speed;}
    public Car3(int year, double speed, int weight){this(year, speed); this.weight = weight;}
    public Car3(int year, double speed, int weight, String color){this(year, speed, weight); this.color = color;}
}
