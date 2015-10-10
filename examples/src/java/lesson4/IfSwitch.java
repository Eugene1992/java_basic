package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfSwitch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Считать строку с консоли
        String songName = reader.readLine();

        switch (songName) {
            case "Sail":
                System.out.println("Imagine dragons");
                break;
            case "Knockin' On Heaven's Door":
                System.out.println("Author or Covers?");
                String authorOrCoverChoice = reader.readLine();
                    switch (authorOrCoverChoice) {
                        case "Author":
                            System.out.println("Bob Dylan");
                            break;
                        case "Covers":
                            System.out.println("Avril Lavine");
                            System.out.println("Guns'n'Roses");
                            System.out.println("Pink Floyd");
                            break;
                    }
                break;
            case "Creep":
                System.out.println("Radiohead");
                break;
            case "I wanna be yours":
                System.out.println("Arctic monkeys");
                break;
        }

        if (songName.equals("Sail")) {
            System.out.println("If found Imagine dragons");
            return;
        }
        if (songName.equals("Yesterday")) {
            System.out.println("The Beatles");
        }
        if (songName.equals("Creep")) {
            System.out.println("Radiohead");
        }
        if (songName.equals("I wanna be yours")) {
            System.out.println("Arctic monkeys");
        }
    }
}
