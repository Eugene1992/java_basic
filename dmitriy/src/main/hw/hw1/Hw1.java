package hw1;

public class Hw1 {
        public static void main(String[] args){
        	
        	
            int x = 10;
            int y = 12;
            int z = 3;

            x += y - x++ * z;
            System.out.println(x);
            z = --x - y * 5;
            System.out.println(z);
            y /= x + 5 % z;
            System.out.println(y);
            x = y - x++ * z;
            System.out.println(x);

        }
    }


