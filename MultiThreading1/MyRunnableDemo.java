public class MyRunnableDemo {
    public static void main(String... args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        Work.display();
    }
}
