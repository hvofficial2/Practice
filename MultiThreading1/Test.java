import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.lang.reflect.*;

public class Test {
    public static void main(String... args) {
        Thread t = new Thread("Name");
        System.out.println(t.getName());
    }
}
