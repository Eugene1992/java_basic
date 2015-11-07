package AbstractHandler;

import java.util.Scanner;

/**
 * Написать программу, которая будет выполнять определение документа и для каждого формата должны
 *быть методы открытия, создания, редактирования, сохранения определенного формата документа.
 */
public class Test {
    public static void main(String[] args) {

        AbstractHandler docHandler = new DOCHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler xmlHandler = new TXTHandler();

        System.out.print("What your document format? (1 - doc, 2 - txt, 3 - xml) - ");

        Scanner sc = new Scanner(System.in);
        byte formatDoc = sc.nextByte();
        byte decide;

        switch (formatDoc) {

            case 1:
                System.out.print("What you want to do with doc format? (1 - Open, 2 - Create, 3 - Change, 4 - Save) - ");
                decide = sc.nextByte();
                switch (decide){
                    case 1:
                        docHandler.Open();
                        break;
                    case 2:
                        docHandler.Create();
                        break;
                    case 3:
                        docHandler.Change();
                        break;
                    case 4:
                        docHandler.Save();
                        break;
                    default:
                        System.out.println("I do not understand.Please, try again");
                }
                break;
            case 2:
                System.out.print("What you want to do with txt format? (1 - Open, 2 - Create, 3 - Change, 4 - Save) - ");
                decide = sc.nextByte();
                switch (decide){
                    case 1:
                        txtHandler.Open();
                        break;
                    case 2:
                        txtHandler.Create();
                        break;
                    case 3:
                        txtHandler.Change();
                        break;
                    case 4:
                        txtHandler.Save();
                        break;
                    default:
                        System.out.println("I do not understand.Please, try again");
                }
                break;
            case 3:
                System.out.print("What you want to do with xml format? (1 - Open, 2 - Create, 3 - Change, 4 - Save) - ");
                decide = sc.nextByte();
                switch (decide){
                    case 1:
                        xmlHandler.Open();
                        break;
                    case 2:
                        xmlHandler.Create();
                        break;
                    case 3:
                        xmlHandler.Change();
                        break;
                    case 4:
                        xmlHandler.Save();
                        break;
                    default:
                        System.out.println("I do not understand.Please, try again");
                }
                break;
            default:
                System.out.println("I do not understand.Please, try again");

        }
    }
}
