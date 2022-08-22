import java.util.Arrays;

public class Test {
    public static void inc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
        System.out.println("Method" + Arrays.toString(a));
    }

    public static void main(String... args) {
        // Float f = Float.valueOf(10.5f);
        // Float f2 = Float.valueOf("10.10");
        // Float f3 = Float.valueOf(10.30);
        // System.out.println(f3);

        // int[] a = { 1, 2, 3 };
        // inc(a);
        // System.out.println(Arrays.toString(a));

        Integer i = 10;
        System.out.println(i);
    }
}