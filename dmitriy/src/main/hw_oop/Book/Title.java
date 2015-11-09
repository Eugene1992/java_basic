package Book;

public class Title {

    private String title;

    public Title(){this.title = title;}
    public String getTitle(){return title;}
    public void setTitle(String newTitle){title = newTitle;}

    void show(){
        System.out.println("Title is - " + getTitle());
    }
}
