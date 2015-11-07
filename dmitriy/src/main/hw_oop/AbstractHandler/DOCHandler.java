package AbstractHandler;

public class DOCHandler extends AbstractHandler {
    @Override
    void Open() {
        super.Open(); System.out.println("DOC document is opened.");
        }

    @Override
    void Create() {
        super.Create(); System.out.println("DOC document is created.");
    }

    @Override
    void Change() {
        super.Change();
        System.out.println("DOC document is changed.");
    }

    @Override
    void Save() {
        super.Save();
        System.out.println("DOC document is saved.");
    }
}

