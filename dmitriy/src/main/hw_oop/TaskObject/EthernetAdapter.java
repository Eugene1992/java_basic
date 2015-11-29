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

public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }
    public String getMac() {
        return mac;
    }

    EthernetAdapter(String manufacture, float price, String serialNumber, int speed, String mac) {
        super(manufacture, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = " + getSpeed() + ", mac = " + getMac();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return !(mac != null ? !mac.equals(that.mac) : that.mac != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }
}
