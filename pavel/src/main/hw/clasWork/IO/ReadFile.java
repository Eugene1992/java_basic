package clasWork.IO;


        import java.io.File;
import java.io.FileInputStream;

public class ReadFile
{
    public static void main( String[] args )
    {
        FileInputStream fileInputStream=null;

        File file = new File("C:\\test.txt");

//        byte[] bFile = new byte[(int) file.length()];

        try {
            //convert file into array of bytes
            fileInputStream = new FileInputStream(file);
//            fileInputStream.read(bFile);
//            fileInputStream.close();
//            char t = 't';
//            int i = t;
//            System.out.println(i);
            int symbol;
            while (fileInputStream.read() !=-1){
               symbol  = fileInputStream.read();
              System.out.println(symbol);

            }
            System.out.println((char)115);
//            for (int i = 0; i < bFile.length; i++) {
////                System.out.print((char)bFile[i]);
//            }

            System.out.println("FileDone");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}