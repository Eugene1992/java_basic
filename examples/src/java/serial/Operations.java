package serial;

import java.io.*;

public class Operations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject dataObject = new DataObject();
        dataObject.setMyData("hahaha");
        File file = new File("data.txt");

        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(dataObject);

        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        DataObject reDataObject = (DataObject)objectInputStream.readObject();

        System.out.println(reDataObject.getMyData());
        System.out.println(reDataObject.getI());

        objectInputStream.close();
    }
}
