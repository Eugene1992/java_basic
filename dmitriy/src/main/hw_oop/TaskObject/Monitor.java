package TaskObject;
/**
 * Задание 2
 * Создать классы:
 * 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
 * 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
 * Добавить методы доступа. Конструктор.
 */
//Задание 3
//        Смотреть задание 2.
//        В обоих классах переопределить метод toString, что бы вывод был следующим:
//        Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//        Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
//        Задание 4
//        Смотреть задание 2.
//        Переопределить методы equals & hashCode в каждом классе.
//        Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные
//        методы.

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }
    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }
    public int getResolutionY() {
        return resolutionY;
    }

    Monitor(String manufacture, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacture, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() + ", resolutionX = " + getResolutionX() + ", resolutionY = " + getResolutionY();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
