public class ThrowsEx {
    public static void main(String...args) throws InterruptedException{
        doStuff();
    }

    public static void doStuff() throws InterruptedException{
        doMoreStuff();
    }

    public static void doMoreStuff() throws InterruptedException{
        throw new InterruptedException("Interrupted Exception Desc.");
    }
}
