package AbstractHandler;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT document is opened.");
    }

    @Override
    void create() {
        System.out.println("TXT document is created.");
    }

    @Override
    void change() {
        System.out.println("TXT document is changed.");
    }

    @Override
    void save() {
        System.out.println("TXT document is saved.");
    }
}
