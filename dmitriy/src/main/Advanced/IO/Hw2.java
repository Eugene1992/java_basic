package IO;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

/**
 * Задание 2
 * 2.1 Написать программу, которая копирует данные из одного текстового файла в другой.
 * 2.2 Пользователь вводит в консоль два параметра - путь копируемого файла и путь к файлу, в который копируются данные.
 * 2.3 Для ввода данных с консоли использовать BufferedReader.
 * 2.4 Создать текстовые файлы для примера и протестировать работу программы.
 * 2.5 Закрыть потоки. Использовать конструкцию try-with-recources. Проанализировать закрытие потоков по сравнению
 * с предыдущим примером.
 */
public class Hw2 {
    public static void main(String[] args) throws IOException{

        InputStream inputStream = null;
        OutputStream outputStream  = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedReader bufferedReader = null;
        Scanner scanner = null;
        FileReader fileReader = null;

        String putFile = null;
        String putCopy = null;

        System.out.println("Enter the put to file");

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            putFile = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println("Enter the to copy file");

            putCopy = bufferedReader.readLine();
            bufferedReader.close();

            File original = new File(putFile);
            File copied = new File(putCopy);

            inputStream = new FileInputStream(original);
            outputStream = new FileOutputStream(copied);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = inputStream.read(buffer)) > 0){

                outputStream.write(buffer, 0, length);

            }

            inputStream.close();
            outputStream.close();

            System.out.println("File is copied successful!");


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}