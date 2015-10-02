/**
 * Created by Евгений on 02.10.2015.
 */
public class BinaryConverter {
    public static void main(String[] args) {
        int value = 120;
        int temp;
        int one, two, three, four, five, six, seven, eight;
        one = value % 2;
        temp = value / 2;
        two = temp % 2;
        temp = temp / 2;
        three = temp % 2;
        temp = temp / 2;
        four = temp % 2;
        temp = temp / 2;
        five = temp % 2;
        temp = temp / 2;
        six = temp % 2;
        temp = temp / 2;
        seven = temp % 2;
        temp = temp / 2;
        eight = temp % 2;

        System.out.println(eight + "" + seven + "" + six + "" + five + "" + four + "" + three + "" + two + "" + one);

    }
}
