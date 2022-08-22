public class WorkwithSleep {
    public static void display() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
