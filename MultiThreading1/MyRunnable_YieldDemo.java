// YIELD
class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MyRunnable_YieldDemo {
    public static void main(String... args) {
        MyRunnable2 mr2 = new MyRunnable2();
        Thread t = new Thread(mr2);
        t.start();
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName());
    }
}