package Book;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter the Author - ");
        author.setAuthor(sc.nextLine());

        System.out.print("Please, enter the Title - ");
        title.setTitle(sc.nextLine());

        System.out.print("Please, enter the Content - ");
        content.setContent(sc.nextLine());

        System.out.println("Your favorite book is - ");
        author.show();
        title.show();
        content.show();
    }
}
