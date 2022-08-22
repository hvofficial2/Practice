public class DeadlockDemo extends Thread {
    A a = new A();
    B b = new B();

    public void run() {
        b.display(a);
    }

    public static void main(String... args) {
        DeadlockDemo dd = new DeadlockDemo();
        dd.start();
        dd.a.display(dd.b);
    }
}

class A {
    public synchronized void display(B b) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        b.last();
    }

    public synchronized void last() {
    }
}

class B {
    public synchronized void display(A a) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        a.last();
    }

    public synchronized void last() {
    }
}
