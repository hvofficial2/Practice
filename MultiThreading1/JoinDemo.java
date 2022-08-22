class MyRunnable3 implements Runnable {
    public void run() {
        WorkwithSleep.display();
    }
}

public class JoinDemo {
    public static void main(String... args) throws InterruptedException {
        MyRunnable3 mr3 = new MyRunnable3();
        Thread t = new Thread(mr3);
        t.start();
        // t.join();
        t.join(5000);
        WorkwithSleep.display();
    }
}
