package hw2;
/* Задание:
1. Проанализировать код программы.
2. Запустить ее и посмотреть какое значение принимает переменная d.
3. Добавить один "кастинг" (операцию по преобразованию типа) в код программы таким образом, чтобы переменная
d приняла знвчение 4.076923076923077
4. Запустить программу, посмотреть результат. Если результат неверный - вернутся к п.1. Если все верно - написать
комментарий к программе и обьяснить почему до подстановки переменная d принимала иное значение.
*/
public class TaskOne {
    public static void main(String[] args) {

        int a = 53;
        int b = 13;
        double d =(double) a / b;

        System.out.println(d);
    }
}
