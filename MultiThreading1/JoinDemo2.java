class MyRunnable4 implements Runnable {
    Thread t = null;

    MyRunnable4(Thread t) {
        this.t = t;
    }

    public void run() {
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        WorkwithSleep.display();
    }
}

public class JoinDemo2 {
    public static void main(String... args) {
        MyRunnable4 mr4 = new MyRunnable4(Thread.currentThread());
        Thread t = new Thread(mr4);
        t.start();
        WorkwithSleep.display();
    }
}
