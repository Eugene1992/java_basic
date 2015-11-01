

/**1. Создать класс Schoolboy, который содержит три поля:
 - имя
 - фамилия
 - оценка
 2. Создать отдельный тестовый класс с методом main.
 3. В методе main создать десять обьектов(экземпляров) класса Schoolboy и проинициализировать ихние поля.
 4. Создать массив типа Schoolboy и поместить туда созданные обьекты.
 5. Используя данный массив как входящий параметр написать матоды для решения следующих задач:
 */

public class Test {
    public static void main(String[] args) {

        Schoolboy one = new Schoolboy("Andry", "Petrov", 18);
        Schoolboy two = new Schoolboy("Andriy", "Menson", 25);
        Schoolboy three = new Schoolboy("Benya", "Tuhly", 50);
        Schoolboy four = new Schoolboy("Vadik", "Salabon", 44);
        Schoolboy five = new Schoolboy("Grigory", "Edakiy", 29);
        Schoolboy six = new Schoolboy("Dulche", "Gabanna", 22);
        Schoolboy seven = new Schoolboy("Subzero", "Olegovich", 25);
        Schoolboy eith = new Schoolboy("Super", "Man", 65);
        Schoolboy nine = new Schoolboy("Andriy", "Gerashenko", 15);
        Schoolboy teen = new Schoolboy("Oleg", "Lashko", 98);

        Schoolboy studentArr[] = new Schoolboy[10];

        Schoolboy studentArrCopy[] = new Schoolboy[10];

        studentArr[0] = one ;
        studentArr[1] = two;
        studentArr[2] = three;
        studentArr[3] = four;
        studentArr[4] = five;
        studentArr[5] = six;
        studentArr[6] = seven;
        studentArr[7] = eith;
        studentArr[8] = nine;
        studentArr[9] = teen;


        /**1. Вывести в консоль значения полей каждого из обьектов в формате: "<имя> <фамилия> получил оценку <оценка>!".
         Пример: "Иванов Иван получил оценку 10!".
         2. Вывести в консоль все парные оценки обьектов массива.
         3. Вывести все оценки обьектов массива в обратном порядке.
         4. Вывести первую и вторую половину оценок массива обьектов.
         5. Вывести первую и вторую половину оценок массива обьектов в обратном порядке.
         6. Найти и вывести сумму всех оценок обьектов массива.
         7. Найти среднеарифметическое всех оценок обьектов массива.
         8. Найти минимальную и максимальную оценку в массиве обьектов.
         9. Заменить все парные оценки в массиве обьектов на 0.
         10. Подсчитать и вывести в консоль одинаковые оценки в массиве обьектов.
         */
//----------------------------------------------------------------------------------------------------------------------




        System.out.println("Show the status of all object - ");// task #1
        System.out.println();

        for (int i = 0; i < studentArr.length ; i++) {
            //        System.out.println(studentArr[i]);
            System.out.println(studentArr[i].name + " " + studentArr[i].surname + " got  - " + studentArr[i].assessment);
        }
        System.out.println();



            //-------------------------------------------------------------------2. Вывести в консоль все парные оценки обьектов массива.
        System.out.println();
        System.out.print("All even assessment - ");

            for (int j = 0; j < studentArr.length; j++) {
                if (studentArr[j].assessment % 2 == 0){
                    System.out.print(studentArr[j].assessment + " ");
                }
            }
        //3. Вывести все оценки обьектов массива в обратном порядке.

        System.out.println();
        System.out.print("All Ratings object array in reverse order - ");

        for (int i = studentArr.length - 1; i >= 0  ; i--) {
            System.out.print(studentArr[i].assessment + " ");
        }
        //----------------------------4. Вывести первую и вторую половину оценок массива обьектов.


        System.out.println();
        System.out.print("First half of assessment - ");

        for (int i = 0; i < studentArr.length / 2; i++) {
            System.out.print(studentArr[i].assessment + " ");
        }
        System.out.println();

        System.out.print("Second half of assessment - ");

        for (int i = studentArr.length / 2; i < studentArr.length ; i++) {
            System.out.print(studentArr[i].assessment + " ");
        }

        //-------------------------5. Вывести первую и вторую половину оценок массива обьектов в обратном порядке.
        System.out.println();

        System.out.print("First half of assessment - in reverse order - ");

        for (int i = studentArr.length / 2 - 1; i >= 0; i--) {
            System.out.print(studentArr[i].assessment + " ");
        }
        System.out.println();

        System.out.print("Second half of assessment - in reverse order - ");

        for (int i = studentArr.length - 1; i >= studentArr.length / 2 ; i--) {
            System.out.print(studentArr[i].assessment + " ");
        }
        System.out.println();

        //---------------------------------6. Найти и вывести сумму всех оценок обьектов массива.
        int sum = 0;
        for (int i = 0; i < studentArr.length; i++) {
             sum += studentArr[i].assessment;
        }
        System.out.print("The sum of all assessment - " + sum);
        System.out.println();

        //--------------------------------7. Найти среднеарифметическое всех оценок обьектов массива

        int average = sum / studentArr.length;
        System.out.print("Arithmetic average of all assessment - " + average);
        System.out.println();

//-----------------------------------8. Найти минимальную и максимальную оценку в массиве обьектов.

        System.out.print("Max. assessment of mas - ");
        int max = 0;
        for (int i = 0; i < studentArr.length ; i++) {
            if (max < studentArr[i].assessment){
                max = studentArr[i].assessment;
            }
        }
        System.out.println(max);
        System.out.println();
        //------------------------9. Заменить все парные оценки в массиве обьектов на 0.


        System.out.print("Change the paired assessment to zero - ");

        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].assessment % 2 == 0)studentArr[i].assessment = 0;
        }
        for (int i = 0; i < studentArr.length; i++) {
            System.out.print(studentArr[i].assessment + " ");
        }
        System.out.println();


        //----------------10. Подсчитать и вывести в консоль одинаковые оценки в массиве обьектов.

        System.out.println();
        System.out.print("Repeat array - ");

        studentArr[0].assessment = 18 ;
        studentArr[1].assessment = 25;
        studentArr[2].assessment = 50;
        studentArr[3].assessment = 44;
        studentArr[4].assessment = 25;
        studentArr[5].assessment = 18;
        studentArr[6].assessment = 29;
        studentArr[7].assessment = 25;
        studentArr[8].assessment = 65;
        studentArr[9].assessment = 98;

        for (int i = 0; i < studentArr.length ; i++) {
            //        System.out.println(studentArr[i]);
            System.out.println(studentArr[i].name + " " + studentArr[i].surname + " got  - " + studentArr[i].assessment);
        }
        System.out.println();





        System.out.print("The same amount of elements in the array - ");
        int counter = 0;

       for (int i = 0; i < studentArr.length; i++) {
           for (int j = studentArr.length - 1; j != i; j--) {
               if (studentArr[j].assessment == studentArr[i].assessment && studentArr[i].assessment != 0 && studentArr[j].assessment != 0){
                    studentArr[j].assessment = 0;
                    counter++;
                }
            }
        }
        System.out.println(counter);
        System.out.println();

        /**11. Поменять минимальную и максимальную оценки в массиве обьектов местами.
         12. Вывести в консоль половину оценок массива обьектов, среднеарифметическое оценок которых является наибольшим.
         13. Найти индексы положительных оценок(которые > 8) и сумму негативных оценок(которые < 8) в массиве обьектов.
         14. Вывести на печать все оценки обьектов с индексом меньше шести включительно.
         15. Поменять местами две наибольшие оценки с первой и последней оценками в массивеобьектов.
         16. Вывести на экран оценки массива обьектов, которые расположены до минимальной оценки обьекта в массиве.
         17. Найти сумму всех оценок находящихся между минимальной и максимальной оценками в массиве обьектов.
         18. Вывести в консоль половину массива в которой находиться наименьшая оценка обьекта.
         19. Написать метод, который перемещает в конец массива все элементы, значения которых находится в отрезке [3,8].
         */
        //----------11. Поменять минимальную и максимальную оценки в массиве обьектов местами.

    }
}
