package hw4;


/**
 * Created by Оксана on 11.10.2015.
 *
 * 13. Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что
 слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 *
 */
public class ThirteenthTask {
    public static void main(String[] args) {

        int Num = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                int x, y, x1, y1;
                if (i < 10) {
                    x = 0;
                    y = i;
                } else {
                    x = i / 10;
                    y = i % 10;
                }
                if (j < 10) {
                    x1 = j;
                    y1 = 0;
                } else {
                    x1 = j / 10;
                    y1 = j % 10;
                }
                if ((x == y1) & (y == x1)) ++Num;

        }
        }
        System.out.println("Number of combinations:"+Num);
    }


}
