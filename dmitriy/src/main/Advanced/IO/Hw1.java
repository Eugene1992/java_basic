package IO;
import org.omg.CORBA.portable.*;

import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

//   Задание 1
//        1.1 Создать текстовый файл и заполнить его данными(латинскими словами).
//        1.2 Написать программу, которая считывает посимвольно данные с файла и подсчитывает количество повторений каждой буквы в нем.
//        1.3 Для подсчета использовать коллекцию Map<Character, Integer>. Ключам соответствуют буквы датинского алфавита,
//        значениям - количество их повторений.
//        1.4 После подсчета вывести полученные данные на экран. Например:
//        a - 10
//        b - 7
//        c - 13
//        ...
//        1.5 Закрыть потоки. НЕ ИСПОЛЬЗОВАТЬ try-with-recources.
public class Hw1 {
    public static void main(String[] args) throws IOException {

        try {
            File catalogue = new File("LatinWords3.txt");// намагаємося створити файл

            catalogue.mkdir(); // create directory
            // to create multiple directories use mkdirs()

            File file = new File("D:\\Доки Димы\\Java\\Java_starter\\dmitriy\\src\\main\\Advanced\\IO\\LatinWords2.txt"); // створюємо файл і вказуємо шлях до нього

            if (file.createNewFile()) { // перевірка створення файла
                System.out.println("File is created!( " + file + " )");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //==============================

        InputStream inStream = null;
        OutputStream outStream = null;

        try{

            File original = new File("D:\\Доки Димы\\Java\\WewCampWorkspace\\Java_starter\\dmitriy\\src\\main\\Advanced\\IO\\LatinWords.txt");
            File copied = new File("D:\\Доки Димы\\Java\\WewCampWorkspace\\Java_starter\\dmitriy\\src\\main\\Advanced\\IO\\LatinWords2.txt");

            inStream = new FileInputStream(original);
            outStream = new FileOutputStream(copied);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = inStream.read(buffer)) > 0){
                outStream.write(buffer, 0, length);
            }

            inStream.close();
            outStream.close();

            System.out.println("File is copied successful!");

        }catch(IOException e){
            e.printStackTrace();
        }


        // ==================================

        InputStream inFile = new FileInputStream("D:\\Доки Димы\\Java\\WewCampWorkspace\\Java_starter\\dmitriy\\src\\main\\Advanced\\IO\\LatinWords2.txt");// створення читача файла
        readFullyByByte(inFile);
    }

    public static Map<Character, Integer> readFullyByByte(InputStream in) throws IOException {

        Map<Character, Integer> map = new TreeMap<>();

        //List<Character> listKey = new ArrayList<>();
       // listKey.add(map.keySet());

        while (in.available() > -1) {
            int oneByte = in.read();
            if (map.containsKey(oneByte)) {
                for (Map.Entry<Character, Integer> s : map.entrySet()) {
                    if (s.equals((char) oneByte)) {
                        s.setValue(s.getValue() + 1);
                    }
                }
            } else {
                map.put((char) oneByte, 0);
            }
        }
        return map;
    }
}

