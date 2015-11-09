package AbstractHandler;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
       System.out.println("DOC document is opened.");
        }

    @Override
    void create() {
        System.out.println("DOC document is created.");
    }

    @Override
    void change() {
       System.out.println("DOC document is changed.");
    }

    @Override
    void save() {
        System.out.println("DOC document is saved.");
    }
}

