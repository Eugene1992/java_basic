package hw2;

/* Задание:
1. Проанализировать код программы. Прогуглить, что означает запись "1e-3".
2. Запустить ее и посмотреть какое значение принимает переменная b.
3. Добавить один "кастинг" (операцию по преобразованию типа) в код программы таким образом, чтобы переменная
b приняла знвчение 0
4. Запустить программу, посмотреть результат. Если результат неверный - вернутся к п.1. Если все верно - написать
комментарий к программе и обьяснить почему до подстановки переменная b принимала иное значение.
*/
public class TaskFive {
    public static void main(String[] args) {
        float f = (float)128.50;
        int i = (int)f;
        int b = (byte)(i + f);
        System.out.println(b);
    }
}
