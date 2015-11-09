import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleFigures {
    static class SweezFlag {
        public static void main(String[] args) {
            for (int i = 0; i < 16; i++) {
                if (i < 2 | i > 13) {
                    for (int j = 0; j < 36; j++) {
                        System.out.print("Ж ");
                    }
                    System.out.println();
                }
                if ((i > 1 & i < 6) | (i > 9 & i < 14)) {
                    for (int j = 0; j < 36; j++) {
                        if (j > 15 & j < 20) System.out.print("- ");
                        else System.out.print("Ж ");
                    }
                    System.out.println();
                }
                if (i > 5 & i < 10) {
                    for (int j = 0; j < 36; j++) {
                        if (j > 11 & j < 24) System.out.print("- ");
                        else System.out.print("Ж ");
                    }
                    System.out.println();
                }
            }
        }
    }

    static class ChessBoard {
        public static void main(String[] args) {
            for (int i = 0; i < 32; i++) {
                if ((i >= 0 & i < 4) | (i > 7 & i < 12) | (i > 15 & i < 20) | (i > 23 & i < 28)){
                    for (int j = 0; j < 32; j++) {
                        if ((j > 3 & j < 8) | (j > 11 & j < 16) | (j > 19 & j < 24) | (j > 27 & j < 32)) System.out.print("- ");
                        else System.out.print("Ж ");
                    }
                    System.out.println();
                } else {
                    for (int j = 0; j < 32; j++) {
                        if ((j > 3 & j < 8) | (j > 11 & j < 16) | (j > 19 & j < 24) | (j > 27 & j < 32)) System.out.print("Ж ");
                        else System.out.print("- ");
                    }
                    System.out.println();
                }
            }
        }
    }

    static class ChessBoard2 {
        public static void main(String[] args) {
            for (int s = 0; s < 8; s++) {
                for (int b = 0; b < 4; b++) {
                    if (s == 0 | s % 2 == 0) {
                        for (int j = 0; j < 8; j++) {
                            if (j == 0 | j % 2 == 0) {
                                for (int k = 0; k < 4; k++) {
                                    System.out.print("@ ");
                                }
                            } else {
                                for (int k = 0; k < 4; k++) {
                                    System.out.print("- ");
                                }
                            }
                        }
                    } else {
                        for (int j = 0; j < 8; j++) {
                            if (j == 0 | j % 2 == 0) {
                                for (int k = 0; k < 4; k++) {
                                    System.out.print("- ");
                                }
                            } else {
                                for (int k = 0; k < 4; k++) {
                                    System.out.print("@ ");
                                }
                            }
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

    static class NumberSystemConverter {
        public static void main(String[] args) throws IOException, InterruptedException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число: ");
            int num = Integer.parseInt(reader.readLine());
            System.out.println("Выберите систему счисления для перевода числа: \n1) в 2-ую \n2) в 8-ую \n3) в 16-ую");
            int numSys = Integer.parseInt(reader.readLine());
            switch (numSys) {
                case 1 :
                    System.out.println("Loading...");
                    Thread.sleep(2000);
                    System.out.println(toBin(num));
                    break;
                case 2 :
                    System.out.println("Loading...");
                    Thread.sleep(2000);
                    System.out.println(toOct(num));
                    break;
                case 3 :
                    System.out.println("Loading...");
                    Thread.sleep(2000);
                    System.out.println(toHex(num));
                    break;
            }
        }

        static String toBin(int i) {
            String num = "";
            double temp;
            while (true) {
                if (i == 0) {
                    return 0 + num;
                } else if (i == 1) {
                    return 1 + num;
                } else {
                    temp = i % 2;
                    if (temp == 0) num = 0 + num;
                    else num = 1 + num;
                    i = i / 2;
                }
            }
        }

        static String toHex(int i) {
            String num = "";
            int temp;
            while (true) {
                if (i < 16) {
                    switch (i) {
                        case 0: return num = 0 + num;
                        case 1: return num = 1 + num;
                        case 2: return num = 2 + num;
                        case 3: return num = 3 + num;
                        case 4: return num = 4 + num;
                        case 5: return num = 5 + num;
                        case 6: return num = 6 + num;
                        case 7: return num = 7 + num;
                        case 8: return num = 8 + num;
                        case 9: return num = 9 + num;
                        case 10: return num = "A" + num;
                        case 11: return num = "B" + num;
                        case 12: return num = "C" + num;
                        case 13: return num = "D" + num;
                        case 14: return num = "E" + num;
                        case 15: return num = "F" + num;
                    }
                } else {
                    temp = i % 16;
                    switch (temp) {
                        case 0: num = 0 + num;
                            break;
                        case 1: num = 1 + num;
                            break;
                        case 2: num = 2 + num;
                            break;
                        case 3: num = 3 + num;
                            break;
                        case 4: num = 4 + num;
                            break;
                        case 5: num = 5 + num;
                            break;
                        case 6: num = 6 + num;
                            break;
                        case 7: num = 7 + num;
                            break;
                        case 8: num = 8 + num;
                            break;
                        case 9: num = 9 + num;
                            break;
                        case 10: num = "A" + num;
                            break;
                        case 11: num = "B" + num;
                            break;
                        case 12: num = "C" + num;
                            break;
                        case 13: num = "D" + num;
                            break;
                        case 14: num = "E" + num;
                            break;
                        case 15: num = "F" + num;
                            break;
                    }
                }
                i = i / 16;
            }
        }

        static String toOct(int i) {
            String num = "";
            int temp;
            while (true) {
                if (i < 8) {
                    switch (i) {
                        case 0: return num = 0 + num;
                        case 1: return num = 1 + num;
                        case 2: return num = 2 + num;
                        case 3: return num = 3 + num;
                        case 4: return num = 4 + num;
                        case 5: return num = 5 + num;
                        case 6: return num = 6 + num;
                        case 7: return num = 7 + num;
                    }
                } else {
                    temp = i % 8;
                    switch (temp) {
                        case 0: num = 0 + num;
                            break;
                        case 1: num = 1 + num;
                            break;
                        case 2: num = 2 + num;
                            break;
                        case 3: num = 3 + num;
                            break;
                        case 4: num = 4 + num;
                            break;
                        case 5: num = 5 + num;
                            break;
                        case 6: num = 6 + num;
                            break;
                        case 7: num = 7 + num;
                            break;
                    }
                }
                i = i / 8;
            }
        }
    }

    static class FortuneTickets {
        public static void main(String[] args) {
            int quantity = 0;
            for (int i = 999999; i > 0; i--) {
                int n1 = i / 100000;
                int n2 = i / 10000 % 10;
                int n3 = i / 1000 % 10;
                int n4 = i / 100 % 10;
                int n5 = i / 10 % 10;
                int n6 = i % 10;
                if (n1 + n2 + n3 == n4 + n5 + n6) {
                    quantity++;
                    System.out.println("" + n1 + n2 + n3 + n4 + n5 + n6);
                }
            }
            System.out.println(quantity);
        }
    }

    static class UnFortuneTickets {
        public static void main(String[] args) {
            for (int i = 999999; i > 0; i--) {
                int n1 = i / 100000;
                int n2 = i / 10000 % 10;
                int n3 = i / 1000 % 10;
                int n4 = i / 100 % 10;
                int n5 = i / 10 % 10;
                int n6 = i % 10;
                if (("" + n1 + n2).equals("13")
                  | ("" + n2 + n3).equals("13")
                  | ("" + n3 + n4).equals("13")
                  | ("" + n4 + n5).equals("13")
                  | ("" + n5 + n6).equals("13")) {
                    System.out.println("" + n1 + n2 + n3 + n4 + n5 + n6);
                }
            }
        }
    }

    static class Clock {
        public static void main(String[] args) {
            String hh;
            String mm;
            for (int i = 0; i < 24;) {
                if (i < 10) hh = "0" + i;
                else hh = "" + i;
                for (int j = 0; j < 60; j++) {
                    if (j < 10) mm = "0" + j;
                    else mm = "" + j;
                    if (hh.equals(new StringBuffer(mm).reverse().toString())){
                        System.out.println(hh + ":" + mm);
                    }
                }
                i++;
            }
        }
    }

    static class Test {
        public static void main(String[] args) {
            int i = 0;
            outer: // Другие команды недопустимы
            for(;true;) { // infinite loop
                inner: // Другие команды недопустимы
                for(; i < 10; i++) {
                    System.out.println("i = " + i);
                    if(i == 2) {
                        System.out.println("continue");
                        continue;
                    }
                    if(i == 3) {
                        System.out.println("break");
                        i++; // В противном случае значение і
                        // не увеличивается.
                        break;
                    }
                    if(i == 7) {
                        System.out.println("continue outer");
                        i++; // В противном случае значение і
                        // не увеличивается.
                        continue outer;
                    }
                    if(i == 8) {
                        System.out.println("break outer");
                        break outer;
                    }
                    for(int k = 0; k < 5; k++) {
                        if(k == 3) {
                            System.out.println("continue inner");
                            continue inner;
                        }
                    }
                }
            }
        }
    }

    static class Test2 {
        public static void main(String[] args) {
            /*label:
            for (; ;) {
                for (int i = 0; i < 10; i++) {
                    if (i == 9) break label;
                    System.out.print(i + " ");
                }
            }*/
            for (int i = 0; i < 10; i++) {
                if (i % 3 != 0) continue;
                System.out.println(i);
            }
        }
    }

}
