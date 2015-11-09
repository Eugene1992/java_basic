package Car;
/**     Задание 2
        Используя Intelij IDEA создать проект, пакет.
        Создать класс Машина с полями год(int), цвет(String).
        Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
        Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
*/
public class Car {
    private int year;
    private String color;

    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    public Car(int year){
        this.year = year;
    }

    public int getYear(){return year;}
    public String getColor(){return color;}
}
