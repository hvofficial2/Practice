public class DaemonDemo extends Thread {
    public void run() {
        WorkwithSleep.display();
    }

    public static void main(String... args) {
        DaemonDemo dd = new DaemonDemo();
        dd.setDaemon(true);
        dd.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
