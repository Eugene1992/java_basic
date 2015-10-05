package lesson3;

/**
 * Created by WebCamp on 01.07.2015.
 */
public class C02_Casting {
    public static void main(String[] args) {

        // Преобразование типа (C02_Casting или Type conversion) - это преобразование значения переменной одного типа в значение другого типа.
        // Выделяют явное (explicit) и неявное (implicit) преобразование типов.

        // Неявное преобразование значения типа - byte в тип int. (преобразование меньшего типа в больший)

        byte a = 10;    //                                      0000 1010  -  1 байт
        int b = 0;      //  0000 0000   0000 0000   0000 0000   0000 0000  -  4 байта
        b = a;          //  0000 0000   0000 0000   0000 0000   0000 1010  -  4 байта

        System.out.println("b = " + b);

        // Неявное преобразование значения типа - int в тип float. (преобразование целого типа в вещественный)
        int c = 255;
        float d = 0f;
        d = c;

        System.out.println("d = " + d);


        // Явное преобразование значения типа - int в тип byte.
        // (преобразование большего типа в меньший, приводит к потере части результата)

        int e = 128;    //  0000 0000   0000 0000   0000 0001   0000 0000  -  4 байта
        byte f = 0;     //                                      0000 0000  -  1 байт
        f = (byte)e;    //                                      0000 0001  -  1 байт
        // f = e;       //  ОШИБКА.
        System.out.println("f = " + f);

        // Явное преобразование значения типа - float в тип int.
        // (преобразование вещественного типа в целый, приводит к потере точности результата)

        float g = 10.5F;
        int h = 0;
        h = (int)g;
        // h = g;       // ОШИБКА.

        System.out.println("h = " + h);

        //   ----------------------------------  Константы  ----------------------------------------------

        // Возможно неявное преобразование значения константы типа - int в тип byte,
        // при инициализации переменной значением константы,
        // если значение константы не превышает максимально допустимого значения переменной.

        final int i = 127;
        byte j = 0;
        j = i;

        System.out.println("j = " + j);

        // Возможно явное преобразование значения константы типа - float в тип byte,
        // при инициализации переменной значением константы,
        // если значение константы не превышает максимально допустимого значения переменной

        final float k = 255;
        byte l = 0;
        l = (byte)k;

        System.out.println("k = " + k);


        // Возможно явное преобразование значения константы,
        // при инициализации переменной значением константы,
        // если значение константы превышает максимально допустимый диапазон значения переменной,
        // (преобразование большего типа в меньший, приводит к потере части результата)

        final int m = 254;  //  0000 0000   0000 0000   0000 0001   0000 0000  -  4 байта
        byte n = 0;         //                                      0000 0000  -  1 байт
        n = (byte)m;        //                                      0000 0001  -  1 байт
        // n = m;           //  ОШИБКА.

        System.out.println(n);

        // Возможно явное преобразование значения вещественной константы,
        // при инициализации целочисленной переменной значением константы,
        // если значение константы превышает максимально допустимый диапазон значения переменной,
        // (преобразование большего типа в меньший, приводит к потере части результата).

        final float o = 128.5f;
        byte p = 0;
        p = (byte)o;
        // p = o;           //  ОШИБКА.

        System.out.println(p);

    }
}
