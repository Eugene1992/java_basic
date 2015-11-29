package Price;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Задание 3
 * Создайте проект, используя IntelliJ IDEA.
 * Требуется: Описать класс с именем Price, содержащую следующие поля:
 * название товара;
 * название магазина, в котором продается товар;
 * стоимость товара в гривнах.
 *
 * Написать программу, выполняющую следующие действия:
 *
 * ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
 * быть упорядочены в алфавитном порядке по названиям магазинов);
 * вывод на экран информации о товарах, продающихся в магазине, название которого введено с
 * клавиатуры (если такого магазина нет, вывести исключение).
 */
public class Test {
    public static void main(String[] args) throws NoStoreExeption {

        Scanner sc = new Scanner(System.in);
        Price arr[] = new Price[2];

        for (int i = 0; i < arr.length; i++) {

            Price price = new Price();

            System.out.print("Enter the name of the product - ");
            price.setNameProduct(sc.next());
            System.out.print("Enter the name of the store - ");
            price.setNameStore(sc.next());
            System.out.print("Enter the price of the product - ");
            price.setPriceProduct(sc.nextDouble());

            arr[i] = price;
        }

        Arrays.sort(arr, new Comparator<Price>() {

            @Override
            public int compare(Price o, Price o2) {
                if (o.getNameStore().equals(o2.getNameStore())) {
                    return (int) o.getPriceProduct() - (int) o2.getPriceProduct();
                } else return o.getNameStore().compareTo(o2.getNameStore());
            }
        });

        for (Price i : arr) {
            System.out.println(i);
        }

        System.out.print("Enter the name of the store - ");

        String temp = sc.next();
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (temp.equals(arr[i].getNameStore())) {
                System.out.println(arr[i]);
                ++counter;
            }
        }

        if (counter == 0) {
            throw new NoStoreExeption();
        }
    }
}

