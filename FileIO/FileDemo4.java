import java.io.*;

public class FileDemo4 {
    public static void main(String... args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("abc.txt", true));
        pw.write(100);
        pw.print(100);

        pw.flush();
        pw.close();
    }
}
