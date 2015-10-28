package hw5;
/** 11. Инвертировать массив
 12. Вывести в консоль половину массива, среднеарифметическое которых является наибольшим
 13. Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве
 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
 15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
 16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива
 17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве
 18. Вывести в консоль половину массива в которой находиться наименьшее число массива
 19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].

 */
public class Hw1Arrays2 {
    public static void main(String[] args) {
//--------------------------------------- Створюємо масів
        System.out.print("Масів - ");

        int m = 6;
        int mas[] = new int[m];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.round(Math.random() * 100));
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        // ------------------------------------ ділемо масів на дві частини і виводимо най більше з двох середньо-арифметичних

        int m1 = m / 2;
        int midS1 = 0;
        int midS2 = 0;

        for (int i = 0; i < m1; i++) {
            midS1 = midS1 + mas[i];
        }
        midS1 = midS1 / m;
        for (int i = m1; i < m; i++) {
            midS2 = midS2 + mas[i];
        }
        while (midS1 > midS2) {
            System.out.println("Середне ррифметичне першої частини масива більше - " + midS1);
        }
        if (midS1 < midS2) {
            System.out.println("Середне ррифметичне другої частини масива більше - " + midS2);
        } else System.out.println("Масиви рівні - " + midS1 + " ; " + midS2);
        System.out.println();

//------------------------------------------13. Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве

        mas[0] = 14;   // заповнюємо масив
        mas[1] = -10;
        mas[2] = 0;
        mas[3] = 76;
        mas[4] = -12;
        mas[5] = -3;


        for (int i = 0; i < mas.length; i++) System.out.print(mas[i] + " ");// виводимо масив
        System.out.println();


        System.out.print("Індекси масиву з позитивними значеннями - ");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                System.out.print(i + "(" + mas[i] + ");");
            }
        }
        System.out.println();
        //-----------------------------------------------------------------

        System.out.print("Сумма відємних чисал в масиві = ");
        int sumMin = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                sumMin = sumMin + (mas[i]);
            }
        }
        System.out.print(sumMin);

        //---------------14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        System.out.println();

        System.out.print("Значення змінних в масиві до нуля включно - ");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != 0) {
                System.out.print(mas[i] + " ");
            } else {
                System.out.println(mas[i]);
                break;
            }
        }
        System.out.println();
//--------------------15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.

        int max = 0;
        int max2 = 0;


        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) max = mas[i];
        }
        System.out.print("Max = " + max);
        System.out.print(" ; ");
        for (int i = 0; i < mas.length; i++) {
            if (max != mas[i] && max2 < mas[i]) {
                max2 = mas[i];
            }
        }
        System.out.println("Маx2 = " + max2);
        System.out.println();


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == max) {
                int v = mas[i];
                mas[i] = mas[0];
                mas[0] = v;
            }
            if (mas[i] == max2) {
                int v = mas[i];
                mas[i] = mas[5];
                mas[5] = v;
            }
        }
        System.out.print("Масі с заміненими значеннями - ");

        for (int i = 0; i < mas.length; i++) System.out.print(mas[i] + " ");// виводимо масив
        System.out.println();


        //16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива

        System.out.println("Єлєменти масива до най меньшого значення - ");

        int min = max;

        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        System.out.println("Мін = " + min);

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != min){
                System.out.print(mas[i] + " ");
            }
            else if (mas[i] == min){
                System.out.print(min + " ");
                i = mas.length;
            }

        }
        System.out.println();

    }

}






