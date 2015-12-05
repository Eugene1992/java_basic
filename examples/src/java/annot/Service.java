package annot;


import java.lang.annotation.*;

@Documented //попадет в джавадоки
@Inherited // данная аннотация будет унасдеываться потомками класса
@Target(ElementType.TYPE) //область применения(класса и интерфейсы в данном случае)
/*
ElementType.ANNOTATION_TYPE - над другими аннотациями
ElementType.ANNOTATION_CONSTRUCTOR - над другими аннотациями
ElementType.ANNOTATION_FIELD - над полями класса
ElementType.ANNOTATION_LOCAL_VARIABLE - над локальными переменными метода
ElementType.ANNOTATION_LOCAL_METHOD - над методами
ElementType.ANNOTATION_LOCAL_PACKAGE - над пакетами
ElementType.ANNOTATION_LOCAL_PARAMETER - над аргументом метода
ElementType.ANNOTATION_LOCAL_TYPE - над классом или мнтерфейсом
*/
@Retention(RetentionPolicy.RUNTIME) //область применения
/*
RetentionPolicy.SOURCE - аннотация будет присутствовать только в итсходном коде
RetentionPolicy.CLASS - аннотация будет присутствовать только во время выполнения компилятора
RetentionPolicy.RUNTIME - аннотация будет присутствовать только во время выполнения программы
*/
public @interface Service {

    String name();

    boolean lazyLoad() default false;
}
