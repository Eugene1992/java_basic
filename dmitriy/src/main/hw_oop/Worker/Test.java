package Worker;
import java.util.Scanner;

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
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Worker arr[] = new Worker[5];

        //Enter the arr data

        for (int i = 0; i < 5; i++) {

            System.out.println("Worker #" + i + ":");
            Worker worker = new Worker();

            System.out.print("Enter worker initialization - ");
            worker.setInitialization(scanner.next());

            System.out.print("Enter worker position - ");
            worker.setPosition(scanner.next());

            System.out.print("Enter worker start year - ");
            try {
                worker.setYerToStart(scanner.nextInt());
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }

            arr[i] = worker;
        }

        //Sort mass

        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if( arr[j].getInitialization().equals(arr[j + 1].getInitialization())){
                String tmp = arr[j].getInitialization();
                arr[j].setInitialization(arr[j+1].getInitialization());
                arr[j+1].setInitialization(tmp);
            }
        }

            //Print Mass

        for (i = 0; i < arr.length; i++){
            System.out.println(arr[i].toPrint());
        }

        System.out.print("Enter the work experience - ");
        for (i = 0; i < arr.length; i++) {
            if (scanner.nextInt() <= arr[i].getYerToStart()){
                System.out.println(arr[i].toPrint());
            }
        }
    }
}
}

