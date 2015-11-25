package other;

/**
 * Created by Евгений on 16.10.2015.
 */
public class Recursion {
    public static void main(String[] args) {
        print(0);
    }

    static void print(int k) {
        //System.out.println(k);
        if (k < 5) {
            print(k+1);
        }
        System.out.println(k);
    }

}
