package Book;

public class Content {

    private String content;

    public Content(){this.content = content;}
    public String getContent(){return content;}
    public void setContent(String newContent){content = newContent;}

    void show(){
        System.out.println("Content is - " + getContent());
    }
}
