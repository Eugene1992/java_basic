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

public class Device {

    private String manufacture;
    private float price;
    private String serialNumber;

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }
    public float getPrice() {
        return price;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    Device(String manufacture, float price, String serialNumber){
        this.manufacture = manufacture;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String toString() {
        return "manufacture = " + getManufacture() + ", price = " + getPrice() + ", serialNumber = " + getSerialNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacture.equals(device.manufacture)) return false;
        return serialNumber.equals(device.serialNumber);

    }

    @Override
    public int hashCode() {
        int result = manufacture.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }
}
