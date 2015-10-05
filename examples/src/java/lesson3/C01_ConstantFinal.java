package lesson3;
/**
 * Created by WebCamp on 01.07.2015.
 */
public class C01_ConstantFinal {
    public static void main(String[] args) {

        // На 13-й строке, создаем константу с именем pi, типа double и присваиваем ей значение 3.141

        final double PI = 3.1415;

        // На 17-й строке, выводим значение константы - pi, на экран.

        System.out.println(PI);

        // Попытка присвоения константе нового значения, приводит к ошибке уровня компиляции!

        // PI = 2.71828183;

    }

}

