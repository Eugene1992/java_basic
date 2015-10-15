package hw5;

/**
 * Created by Оксана on 15.10.2015.
 * <p>
 * 1. Вывести в консоль все парные числа одномерного массива
 */
public class FirstTask {
    public static void main(String[] args) {
        int arr[] = {4, 6, 32, 4, 1, 4, 6, 34, 5, 3, 5};
        for (int i = 0; i < 11; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
        }
    }
}


