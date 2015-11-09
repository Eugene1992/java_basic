package Play;

import java.util.Scanner;

/**
 * Задание 3
 * Используя IntelliJ IDEA, создайте проект.Требуется:
 * Cоздайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void Play() /
 * void Pause() / void Stop() и void Record() / void Pause() / void Stop() соответственно.
 * Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
 * Написать программу, которая выполняет проигрывание и запись.
 */
public class Test {
    public static void main(String[] args) {

        label:
        while (true) {

            System.out.print("Clic - 1 (play); 2 (recod)   ");
            Scanner sc = new Scanner(System.in);
            Player player = new Player();
            byte selection = sc.nextByte();

                switch (selection) {

                    case 1:
                        player.play();
                        System.out.println("You can clic -  3 (pause); 4 (stop)   ");
                        selection = sc.nextByte();

                        if (selection == 3) {
                            player.pause();
                        }
                        if (selection == 4) {
                            player.stop();
                        } else System.out.println("?");
                        continue label;

                    case 2:
                        player.record();
                        System.out.println("You can clic -  3 (pause); 4 (stop)   ");
                        selection = sc.nextByte();

                        if (selection == 3) {
                            player.pause();
                        }
                        if (selection == 4) {
                            player.stop();
                        } else System.out.println("?");
                        continue label;

                    default:
                        System.out.println("If you wont to exit enter - e");
                            if (sc.next().equals("e")){
                                break label;
                            }
                }
            }
        }
    }