import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class Test {
    public static void main(String... args) {
        // String str = new String("ABCDE");
        // // System.out.println(str.lastIndexOf('E', 4));
        // String str2 = new String("ABB");
        // System.out.println(str.compareTo(str2));

        StringBuffer sb = new StringBuffer("ABCD");
        sb.setCharAt(1, 'A');
        System.out.println(sb);
        sb.insert(1, "HOHO");
        System.out.println(sb);
    }
}
