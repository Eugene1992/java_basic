package oop4.task;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        if (key.equals("pro")) {
            DocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
            proDocumentWorker.openDocument();
        } else if (key.equals("exp")) {
            DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.saveDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.openDocument();
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();


            // instansoff ()привидения
        }
    }
}
