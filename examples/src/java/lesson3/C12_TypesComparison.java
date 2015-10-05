package lesson3;

/**
 * Created by WebCamp on 02.07.2015.
 */
public class C12_TypesComparison {

        public static void main(String[] args) {
            boolean result1;
            boolean result2;

            int a = 1;
            float b = 2.0f;
            result1 = a < b;   // Сравнение значения типа int, со значением типа float - допустимо.

            String c = "Hello";
            // result = c < a; // Сравнение значения типа int, со значением типа string - не допустимо.
            result2 = c.equals(a);
            System.out.println(result1);
            System.out.println(result2);
    }
}
