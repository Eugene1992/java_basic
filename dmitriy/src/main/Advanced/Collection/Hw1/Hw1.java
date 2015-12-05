package Collection.Hw1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Задание 2
 * Создайте коллекцию, в которую можно добавлять покупателей и категорию приобретенной ими
 * продукции. Из коллекции можно получать категории товаров, которые купил покупатель или по
 * категории определить покупателей.
 */
public class Hw1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        String buyer;
        String category;

        if (counter == 0) {
            System.out.printf("Enter the buyer and category of product - ");
            buyer = sc.nextLine();
            category = sc.nextLine();
            map.put(buyer, category);
        }






    }
}
