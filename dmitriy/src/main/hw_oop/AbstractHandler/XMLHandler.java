package AbstractHandler;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("XML document is opened.");
    }

    @Override
    void create() {
        System.out.println("XML document is created.");
    }

    @Override
    void change() {
       System.out.println("XML document is changed.");
    }

    @Override
    void save() {
        System.out.println("XML document is saved.");
    }
}
