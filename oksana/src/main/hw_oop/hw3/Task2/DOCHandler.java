package hw3.Task2;

/**
 * Created by Оксана on 07.11.2015.
 */
public class DOCHandler extends AbstractHandler {
    @Override
    void Open() {
        super.Open();
        System.out.println("File Opened");

    }

    @Override
    void Create() {
        super.Create();
        System.out.println("File Created");
    }

    @Override
    void Change() {
        super.Change();
        System.out.println("File Changed");
    }

    @Override
    void Save() {
        super.Save();
        System.out.println("File Saved");
    }
}
