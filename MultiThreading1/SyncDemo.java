class MyRunnable5 implements Runnable {
    String name;
    SyncWork sw;

    MyRunnable5(String name, SyncWork sw) {
        this.name = name;
        this.sw = sw;
    }

    public void run() {
        sw.wish(name);
    }
}

public class SyncDemo {
    public static void main(String... args) {
        SyncWork sw = new SyncWork();

        MyRunnable5 mr1 = new MyRunnable5("Dhoni", sw);
        Thread t1 = new Thread(mr1);

        MyRunnable5 mr2 = new MyRunnable5("Virat", sw);
        Thread t2 = new Thread(mr2);

        t1.start();
        t2.start();
    }
}
