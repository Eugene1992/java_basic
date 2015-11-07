package AbstractHandler;

public class TXTHandler extends AbstractHandler {
    @Override
    void Open() {
        super.Open(); System.out.println("TXT document is opened.");
    }

    @Override
    void Create() {
        super.Create(); System.out.println("TXT document is created.");
    }

    @Override
    void Change() {
        super.Change();
        System.out.println("TXT document is changed.");
    }

    @Override
    void Save() {
        super.Save();
        System.out.println("TXT document is saved.");
    }
}
