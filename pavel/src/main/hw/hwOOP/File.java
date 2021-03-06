package hwOOP;

import org.junit.Test;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class File {
    @Test
        public void copyCharacters ()throws IOException {
            FileReader inputStream = null;
            FileWriter outputStream = null;
            try {
                inputStream = new FileReader("C:\\test.txt");
                outputStream = new FileWriter("C:\\test.txt");

                int c;
                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }
