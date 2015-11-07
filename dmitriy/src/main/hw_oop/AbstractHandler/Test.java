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
        int formatDoc = sc.nextByte();
        int decide;

        switch (formatDoc) {

                case 1:
                    System.out.print("What you want to do with doc format? (1 - Open, 2 - Create, 3 - Change, 4 - Save) - ");
                    decide = sc.nextByte();

                    switch (decide) {
                        case 1:
                            docHandler.open();
                            break;
                        case 2:
                            docHandler.create();
                            break;
                        case 3:
                            docHandler.change();
                            break;
                        case 4:
                            docHandler.save();
                            break;
                        default:
                            System.out.println("I do not understand. Please, try again");
                    }
                    break;
                case 2:
                    System.out.print("What you want to do with txt format? (1 - Open, 2 - Create, 3 - Change, 4 - Save) - ");
                    decide = sc.nextByte();
                    switch (decide) {
                        case 1:
                            txtHandler.open();
                            break;
                        case 2:
                            txtHandler.create();
                            break;
                        case 3:
                            txtHandler.change();
                            break;
                        case 4:
                            txtHandler.save();
                            break;
                        default:
                            System.out.println("I do not understand. Please, try again");
                    }
                    break;
                case 3:
                    System.out.print("What you want to do with xml format? (1 - Open, 2 - Create, 3 - Change, 4 - Save) - ");
                    decide = sc.nextByte();
                    switch (decide) {
                        case 1:
                            xmlHandler.open();
                            break;
                        case 2:
                            xmlHandler.create();
                            break;
                        case 3:
                            xmlHandler.change();
                            break;
                        case 4:
                            xmlHandler.save();
                            break;
                        default:
                            System.out.println("I do not understand. Please, try again");
                    }
                    break;
                default:
                    System.out.println("I do not understand. Please, try again");
            }
        }
    }
