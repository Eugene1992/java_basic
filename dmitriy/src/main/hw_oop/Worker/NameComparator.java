package Worker;
import java.util.Comparator;

public class NameComparator implements Comparator<Worker> {

    public int compare(Worker o1, Worker o2) {
        return o1.getInitialization().compareTo(o2.getInitialization());

    }
}
