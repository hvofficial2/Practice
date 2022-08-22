class MyRunnable6 implements Runnable {
    String name;

    MyRunnable6(String name) {
        this.name = name;
    }

    public void run() {
        StaticSyncWork.wish(name);
    }
}

public class StaticSyncDemo {
    public static void main(String... args) {
        MyRunnable6 mr1 = new MyRunnable6("Dhoni");
        MyRunnable6 mr2 = new MyRunnable6("Virat");
        MyRunnable6 mr3 = new MyRunnable6("Sachin");

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        Thread t3 = new Thread(mr3);

        t1.start();
        t2.start();
        t3.start();
    }
}
