package Vehicle2;
 /**
 * Задание 2
 * Создайте проект, используя IntelliJ IDEA.
 * Требуется:
 * Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
 * которые также должны содержать метод print. Создайте екземпляры классов Wheel и Door.
 */
public class Vehicle2 {
     public static void main(String[] args) {

         System.out.println("Vehicle2:");

     class Weel{
         public String print(){
             return "Weel";
         }
     }

         class Door{
         public String print(){
             return "Door";
         }
     }

     Weel weel = new Weel();
     Door door = new Door();

         System.out.println(weel.print());
         System.out.println(door.print());
     }
}
