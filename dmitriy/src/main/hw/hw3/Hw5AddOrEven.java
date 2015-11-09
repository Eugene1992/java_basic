package hw3;

public class Hw5AddOrEven {
    public static void main(String[] args) {

        int n = 0;

        while (n < 100) {
            if (n % 2 == 0) {System.out.println(n + " - even");} else {System.out.println(n + " - odd");}
            n++;
        }
    }
}

