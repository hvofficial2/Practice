public class Test implements Cloneable {
    StringBuilder name;
    int rollno;

    Test(StringBuilder name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    // Test(int rollno) {
    // this.rollno = rollno;
    // }

    public static void main(String... args) throws CloneNotSupportedException {
        // Test t1 = new Test(01);
        // Test t2 = (Test) t1.clone();

        // t1.rollno += 10;
        // System.out.println("T1: " + t1.rollno);
        // System.out.println("T2: " + t2.rollno);

        Test t1 = new Test(new StringBuilder("Dhoni"), 01);
        Test t2 = (Test) t1.clone();

        t1.name.append(" MS");
        System.out.println("T1: " + t1.rollno);
        System.out.println("T1: " + t1.name);
        System.out.println();
        System.out.println("T2: " + t2.rollno);
        System.out.println("T2: " + t2.name);
    }
}
