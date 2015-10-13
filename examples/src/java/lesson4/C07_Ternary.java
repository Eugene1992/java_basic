package lesson4;
import java.util.Scanner;

/**
 * Created by WebCamp on 04.07.2015.
 */
public class C07_Ternary {
    // Тернарная условная операция.

    public static void main(String[] args) {
        String string = "Hello ";

        System.out.println("Введите свой логин:");
        Scanner in = new Scanner(System.in);
        // На 17 строке создаем переменную с именем login типа string и принимаем в нее ввод от пользователя

        String login = in.next();

        // На 21 строке переменной @string присваиваем возвращаемое значение тернарного оператора

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);
    }
}
