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
public class Test {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 12.09765f , "21F23ABCX23");
        Device monitor = new Monitor("Samsung", 120 , "21F23ABCX23", 1280, 1024);
        Device ethernetAdapter = new EthernetAdapter("Samsung", 456, "Ab64538N876VF", 1289, "MacWindowsLinux");

        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter.toString());

        System.out.println("Clas Device hashCode - " + device.hashCode());
        System.out.println("Clas Monitor hashCode - " + monitor.hashCode());
        System.out.println("Clas EthernetAdapter hashCode - " + ethernetAdapter.hashCode());

        System.out.println(device.equals(monitor));
        System.out.println(monitor.equals(ethernetAdapter));
        System.out.println(ethernetAdapter.equals(device));

        System.out.println(device.equals(device));
    }
}
