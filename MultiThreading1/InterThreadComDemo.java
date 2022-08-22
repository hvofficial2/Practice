class MyRunnable7 implements Runnable {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Cal. started by child thread");
            for (int i = 0; i <= 100; i++)
                total += i;
            System.out.println("Cal. completed by child Thread");
            this.notify();
        }
    }
}

public class InterThreadComDemo {
    public static void main(String... args) throws InterruptedException {
        MyRunnable7 mr7 = new MyRunnable7();
        Thread t = new Thread(mr7);
        t.start();
        synchronized (t) {
            System.out.println("Main Thread waiting for cal.");
            t.wait();
            System.out.println("Main THread received notification.");
            System.out.println("Total: " + mr7.total);
        }
    }
}
