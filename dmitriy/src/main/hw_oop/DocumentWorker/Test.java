package DocumentWorker;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Вводи! - ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        if (key.equals("pro")){
            DocumentWorker proDokumentWorker = new ProDokumentWorker();
            proDokumentWorker.editDocument();
            proDokumentWorker.saveDocument();
            proDokumentWorker.openDocument();
        }else if(key.equals("exp")){
            DocumentWorker expDokumentWorker = new ExpertDokumentWorker();
            expDokumentWorker.openDocument();
            expDokumentWorker.saveDocument();
            expDokumentWorker.editDocument();
        }else {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.editDocument();
            documentWorker.saveDocument();
            documentWorker.openDocument();
        }

    }
}
