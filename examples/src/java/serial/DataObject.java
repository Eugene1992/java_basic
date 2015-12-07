package serial;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject extends NonSerializable implements Serializable{
    private int i = 10;
    private String s = "some String";
    private transient String[] strings = {"aa", "bb"};
    private CustomObject c;

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    public String[] getStrings() {
        return strings;
    }

    public CustomObject getC() {
        return c;
    }

    {/*// custom Serializable
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // вызов стандартной сериализации данного обьекта
        out.writeObject(getMyData());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // вызов стандартной десериализации данного обьекта
        setMyData((String) in.readObject());
    }*/
    }
}
