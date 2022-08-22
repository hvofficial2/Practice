import java.io.*;

class FileDemo1 {
    public static void main(String... args) throws IOException {
        File f1 = new File("demo.txt");
        if (!f1.exists())
            f1.createNewFile();
        System.out.println(f1.exists());
    }
}