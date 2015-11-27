package Worker;
/**
 * Задание 2
 * Создайте проект, используя IntelliJ IDEA.
 * Требуется:
 * Описать класс с именем Worker, содержащую следующие поля:
 * фамилия и инициалы работника;
 * название занимаемой должности;
 * год поступления на работу.
 * Написать программу, выполняющую следующие действия:
 * ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
 * быть упорядочены по алфавиту);
 * если значение года введено не в соответствующем формате выдает исключение.
 * вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */
public class Worker {

    private String initialization;
    private String position;
    private int yerToStart;

    public void setInitialization(String initialization){
        this.initialization = initialization;
    }
    public String getInitialization(){
        return initialization;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public void setYerToStart(int yerToStart){
        this.yerToStart = yerToStart;
    }
    public int getYerToStart(){
        return yerToStart;
    }

    public String toPrint(){
        return "" + getInitialization() + " " + getPosition() + " " + getYerToStart();
    }
}
