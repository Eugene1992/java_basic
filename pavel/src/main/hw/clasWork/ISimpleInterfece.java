package clasWork;

import java.util.Objects;

public interface ISimpleInterfece {
    int i=10;
    void doSomething();

    default void doSomethingElse(String name) {
        System.out.println(name);

    }

}
