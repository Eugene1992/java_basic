package Vehicle3;
 /**
 * Задание
 * Создайте проект, используя IntelliJ IDEA.
 * Создайте перечислительный тип (enum) Vehicles, содержащий коструктор, который должен принимать
 * целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
 * строку с цветом автомобиля, и содержать перегруженый метод toString(), который должен возвращать
 * строку с названием экземпляра, цветом и стоимостью автомобиля.
 */
public enum Vehicles{
     ;

     private int cost;
     private String name;
     private String color;

     Vehicles(int cost, String name, String color){
         this.cost = cost;
         this.name = name;
         this.color = color;
     }

     public String getColor(){
         return color;
        }

     @Override
     public String toString() {
         return "" + name + " " + getColor() + " " + cost;
     }
 }




