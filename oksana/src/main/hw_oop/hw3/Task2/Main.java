package hw3.Task2;

import java.util.Scanner;

/**
 * Created by Оксана on 08.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        AbstractHandler doc1 = new DOCHandler();
        AbstractHandler doc2 = new TXTHandler();
        AbstractHandler doc3 = new XMLHandler();


        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of task (1- DocHandler, 2- TXTHendler, 3-XMLHendler");
        int task = read.nextInt();
        switch (task) {
            case 1:
                doc1.Open();
                doc1.Create();
                doc1.Change();
                doc1.Save();

                break;
            case 2:
                doc2.Open();
                doc2.Create();
                doc2.Change();
                doc2.Save();
                break;
            case 3:
                doc3.Open();
                doc3.Create();
                doc3.Change();
                doc3.Save();
                break;

            default:
                System.out.println("?");
        }
    }
}
