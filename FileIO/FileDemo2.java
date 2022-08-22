import java.io.*;

public class FileDemo2 {
    public static void main(String... args) throws IOException {
        File dir1 = new File("Dir01");
        File f1 = new File(dir1, "abc.txt");

        if (!dir1.exists())
            dir1.mkdir();
        f1.createNewFile();
    }
}
