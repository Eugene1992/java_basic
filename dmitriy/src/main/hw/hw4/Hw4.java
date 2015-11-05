package hw4;
/**
 * 8. Вывести в консоль швейцарский флаг произвольных размеров. Например:
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - - - - - - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - - - - - - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - - - - - - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - - - - - - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж - - - - Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж Ж
 */
public class Hw4 {
    public static void main(String[] args) {

        char a = 'Ж';
        char b = '-';

        int counter = 1; // щечик символів
        int counter2 = 1; // щечик рядків
        int counter3 = 1;

        while (counter2 <= 16) { // рядки
            if (counter2 <= 2) {
                for (int i = 1; i <= 32; i++) {
                    System.out.print(a);
                }
                System.out.println();
                counter2++;
            } else {
                if (counter2 <= 6) {
                    for (int i = 1; i <= 12; i++) {
                        System.out.print(a);
                    }
                    for (int i = 1; i <= 8; i++) {
                        System.out.print(b);
                    }
                    for (int i = 1; i <= 12; i++) {
                        System.out.print(a);
                    }
                    counter2++;
                    System.out.println();
                } else {
                    if (counter2 <= 10) {
                        for (int i = 1; i <= 4; i++) {
                            System.out.print(a);
                        }
                        for (int i = 1; i <= 24; i++) {
                            System.out.print(b);
                        }
                        for (int i = 1; i <= 4; i++) {
                            System.out.print(a);
                        }
                        counter2++;
                        System.out.println();
                    } else {
                        if (counter2 <= 14) {
                            for (int i = 1; i <= 12; i++) {
                                System.out.print(a);
                            }
                            for (int i = 1; i <= 8; i++) {
                                System.out.print(b);
                            }
                            for (int i = 1; i <= 12; i++) {
                                System.out.print(a);
                            }
                            counter2++;
                            System.out.println();
                        } else {
                            if (counter2 <= 18) {
                                for (int i = 1; i <= 32; i++) {
                                    System.out.print(a);
                                }
                                System.out.println();
                                counter2++;
                            }
                        }
                    }
                }
            }
        }
    }
}
