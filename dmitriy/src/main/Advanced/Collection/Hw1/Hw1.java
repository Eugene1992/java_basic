package Collection.Hw1;

import java.util.*;

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

        while (counter == 0) {
            System.out.println("Enter the buyer and category of product (or 'exit'): ");
            buyer = sc.nextLine();
            if (buyer.equals("exit")) {
                counter++;
            } else {
                category = sc.nextLine();
                map.put(buyer, category);
            }
        }

        System.out.println(map.size());
        System.out.println("Enter the customer for which you wish to obtain a category");
        System.out.println("Or categories of products for which customers wish to vie");

        String temp = sc.nextLine();

        if (map.containsKey(temp) || map.containsValue(temp)) {

            for (Map.Entry<String, String> item : map.entrySet()) {
                if (item.getKey().equals(temp))
                    System.out.println("Bayer - " + item.getKey() + "; " + "Category - " + item.getValue());
                break;
            }
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (pair.getValue().equals(temp)) {
                    System.out.println("Bayer - " + pair.getKey() + "; " + "Category - " + pair.getValue());
                }
            }
        }else System.out.println("Argument is not found");
    }
}
