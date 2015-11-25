package colls;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {

    @Test
    public void blockingQueueTest(){
        //Queue<String> cars = new ArrayBlockingQueue<String>(4);
        Deque<String> cars = new ArrayDeque<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Aston Martin");
        cars.add("BMW");
        cars.add("Chevrolet");

        Queue<String> ligoQueue = Collections.asLifoQueue(cars);
    }
}
