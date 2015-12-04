package annot;

@Service(name = "superSimpleService")
public class SimpleService {

    @Init
    public void initService(){
        System.out.println("Hello");
    }

    public void someAnotherMethod(){

    }
}
