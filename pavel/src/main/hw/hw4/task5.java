package hw4;

/**
 * Created by ppota on 10/11/2015.
 */
public class task5 {

        public static void main(String[] args) {
            int roll[] = new int[20];

            for (int i = 0; i <20; i++) {
                if (i == 0) roll[i] = 1;
                if (i == 1) roll[i] = 1;
                if (i > 1) roll[i] = roll[i - 1] + roll[i - 2];
                System.out.print(roll[i] + " ");
            }
        }
    }

