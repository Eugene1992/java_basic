package hw52;

import java.util.ArrayList;

/**
 * Created by IT on 08.11.2015.
 */
public class Zoo {
    private String kind;
    private String name;
    private static ArrayList<Zoo> zooArrayList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {

        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public static void add(int i, Zoo element){

        zooArrayList.add(i, element);
    }

    public String toString(){

        return "kind="+ kind +", name"+name ;
    }

    public static void println(){
        for (int i = 0; i < zooArrayList.size() ; i++) {
            System.out.println(zooArrayList.get(i).toString());
        }
    }

    public Zoo(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }
}
