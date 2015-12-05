package annot;

public class Test {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
    }

    static void inspectService(Class<?> service){
        if (service.isAnnotationPresent(Service.class)){
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());
        }
    }
}
