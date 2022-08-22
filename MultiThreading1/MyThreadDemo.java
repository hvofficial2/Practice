public class MyThreadDemo {
    public static void main(String... args) {
        MyThread mt = new MyThread();
        mt.start();
        Work.display();
    }
}
