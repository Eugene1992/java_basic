package Distance;

import java.util.Scanner;

/**
 * Задание 3
 * Создайте проект, используя IntelliJ IDEA.
 * Требуется:
 * Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
 * статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
 * измерения (к примеру из матров в километры, из километров в мили, и так далее).
 */
public class Test {
    public static void main(String[] args) {

        Distance dis = new Distance();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number - ");

        dis.setDistanse(sc.nextDouble());

        System.out.println("Select translation:");
        System.out.println("1 - Milimetr to Santimetr");
        System.out.println("2 - Santimetr to Milimetr");
        System.out.println("3 - Santimetr to Metr");
        System.out.println("4 - Metr to Santimetr");
        System.out.println("5 - Santimetr to DcMetr");
        System.out.println("6 - DcMetr to Santimetr");
        System.out.println("7 - Metr to Kilometr");
        System.out.println("8 - Kilometr to Metr");
        System.out.println("9 - Kilometr to Mili");
        System.out.println("10 - Mili to Kilometr");

        int numb = sc.nextInt();

        switch (numb){
            case 1: Distance.print(dis.getDistanse());
        }
    }
}
