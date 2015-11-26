package Worker;
import java.util.Arrays;
import java.util.Comparator;
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
        final Worker arr[] = new Worker[5];

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

        Arrays.sort(arr, new Comparator<Worker>() {

            @Override
            public int compare(Worker o, Worker o2) {
                if (o.getInitialization().equals(o2.getInitialization())) {
                    return o.getYerToStart() - o2.getYerToStart();

                }else return o.getInitialization().compareTo(o2.getInitialization());
            }
        });

        //Print Mass

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].toPrint());
        }

        System.out.print("Enter the work experience - ");
        int temp = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (temp <= arr[i].getYerToStart()){
                System.out.println(arr[i].toPrint());
            }
        }
    }
}


