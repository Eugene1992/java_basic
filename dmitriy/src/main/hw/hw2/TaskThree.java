package hw2;

/* Задание:
1. Проанализировать код программы.
2. Запустить ее и посмотреть какое значение принимает переменная d.
3. Добавить один "кастинг" (операцию по преобразованию типа) в код программы таким образом, чтобы переменная
d приняла знвчение 5.5
4. Запустить программу, посмотреть результат. Если результат неверный - вернутся к п.1. Если все верно - написать
комментарий к программе и обьяснить почему до подстановки переменная d принимала иное значение.
*/
public class TaskThree {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b/c/e;

        System.out.println(d);
    }
}
