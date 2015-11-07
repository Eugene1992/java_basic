package AbstractHandler;

public class XMLHandler extends AbstractHandler{
    @Override
    void Open() {
        super.Open(); System.out.println("XML document is opened.");
    }

    @Override
    void Create() {
        super.Create(); System.out.println("XML document is created.");
    }

    @Override
    void Change() {
        super.Change();
        System.out.println("XML document is changed.");
    }

    @Override
    void Save() {
        super.Save();
        System.out.println("XML document is saved.");
    }
}
