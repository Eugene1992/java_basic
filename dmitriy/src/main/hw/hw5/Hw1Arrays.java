package hw5;

public class Hw1Arrays {
    public static void main(String[] args) {

        //Task 1

        byte[] array = new byte[10];
        array[0] = 10;
        array[1] = 30;
        array[2] = 20;
        array[3] = -25;
        array[4] = 30;
        array[5] = -35;
        array[5] = 40;
        array[6] = 0;
        array[7] = -50;
        array[8] = 55;
        array[9] = 30;

        System.out.print("Значення масіва _array_ послідовно - ");

        for (int i = 0; i < array.length; i++  ) System.out.print(array[i] + " ");
        System.out.println();

        //-------------------------   8. Заменить все отрицательные числа в массиве на 0

        System.out.print("Замінюємо відємні значення на 0 - ");
        for (int i = 0; i < array.length; i++){
            if (array[i] <= 0){
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Масів з " + array.length + " значень навпаки - " + array[9] + " " + array[8] + " " + array[7] + " " + array[6] + " " + array[5] + " " + array[4] + " " + array[3] + " " + array[2] + " " + array[1] + " " + array[0]);
        System.out.println();

        //9. Подсчитать одинаковые числа в одномерном массиве

        int col = 0;

        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array.length; n++) {
                if (array[i] == array[n])
                     col += 1;
                }
            }
        System.out.print("Кількісто однакових значень в масиві - " + col);// помилка підрахунку...
        System.out.println();

        //-------------------------------------------------------------------------------------------------------------------------------

        int n = 16;
        int[] array1 = new int[n];

        System.out.print("Масив заповнений послідовно - ");

        for (short i = 0; i < n; i++) {
            array1[i] = (int) (i + i);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println();

        //-----------------------------------------------------------------------------------------
        /**3. Вывести первую и вторую половину одномерного массива
         4. Вывести первую и вторую половину одномерного массива в обратном порядке
         */

        System.out.print("Перша половина масіва - ");

        int a = n / 2;
        for (int i = 0; i < a; i++) System.out.print(array1[i] + " ");

        System.out.println();
        System.out.print("Друга половина масіва - ");

        for (int i = a; i < n; i++) System.out.print(array1[i] + " ");
        System.out.println();

        System.out.print("Перша половина масіва у зворотньому напрямку - ");
        for (int i = a - 1; i >= 0; i--) System.out.print(array1[i] + " ");
        System.out.println();

        System.out.print("Друга половина масіва у зворотньому напрямку - ");
        for (int i = n - 1; i >= a; i--) System.out.print(array1[i] + " ");
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------------------------------------------------------------------

        System.out.print("Масів у зворотньому напрямку - "); //2. Вывести все числа одномерного массива в обратном порядке

        for (int i = n - 1; i >= 0; i--){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //-------------------------------------------------------------------------------------------------------------------------------------

        System.out.print("Масів заповнений довільно (через цикл for) - ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.round(Math.random() * 100));
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //-------------------------------------------------------------------------------------------------------------------------------

        int min = array[0];
        int max = 0;

        System.out.println();

        System.out.print("Мінімальне та максимальне значення, вибране з довільного масива - ");// 7. Найти минимальное и максимальное число в массиве

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (min > array1[j]) {
                    min = array1[j];
                }
            }
        }

        System.out.print("Min = " + min + " ; ");

        for (int o = 0; o < array1.length; o++){
            if (max < array1[o])max = array1[o];
        }
        System.out.println("Max = " + max);

        //-------------------------------------------------------------------------------------------------

        int c;
        int maxi = 0;
        int mini = 0;

        for (int i = 0; i < array1.length; i++) {
            if (max == array1[i]) {
                maxi = i;
            }
            if (min == array1[i]) {
                mini = i;
            }
        }

        c = array1[maxi];
        array1[maxi] = array1[mini];
        array1[mini] = (byte) c;

        System.out.println("Міняємо місцем максимальне значення - " + max + " з мінімальним - " + min);
        System.out.println();
        System.out.print("Масів з поміняними значеннями -------------- ");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------------------

        int sum = 0;

        for (int i = 0; i < array1.length; i++){
            sum = sum + array1[i];
        }
        System.out.println("Сумма усіх значень довільного масіва = " +sum);//   5. Найти сумму все элементов в массиве

        // ---------------------------------------------------------------------------------------------------------------------------

        int midle = sum / n;
        System.out.println("Середне арифметичне значення довільного масива - " + midle);// 6. Найти среднеарифметическое всех чисел массива

        // -----------------------------------------------------------------------------------------------------------------------------

        System.out.print("Аргументи довільного масіва, що діляться на 2 - "); //1. Вывести в консоль все парные числа одномерного массива

        for (int i = 0; i < array1.length; i++){
            if (array1[i] % 2 == 0){
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------------------------
    }
}
