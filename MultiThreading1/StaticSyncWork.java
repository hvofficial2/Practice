public class StaticSyncWork {
    public synchronized static void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning " + name);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}