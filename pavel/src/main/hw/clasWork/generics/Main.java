package clasWork.generics;

import java.lang.reflect.MalformedParametersException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Main {
        public static void main (String[] args) throws MalformedParametersException, MalformedURLException {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Test");
            arrayList.add(1);
            arrayList.add(100L);
            arrayList.add(0.0);
            arrayList.add(new URL("http://localhost:8080"));

            Object object = arrayList.get(0);
            if (object instanceof String){
                String str = (String)arrayList.get(0);
                System.out.println(str);
            }
ArrayList<?> testList = new ArrayList<>();
//            testList.add(1);

        }

    }

