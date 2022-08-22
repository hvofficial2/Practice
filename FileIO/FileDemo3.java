import java.io.*;

public class FileDemo3 {
    public static void main(String... args) throws IOException {
        File f1 = new File("C:\\Users\\Zeus\\Desktop\\Rebirth3\\Practice");
        String[] str = f1.list();
        System.out.println("No. of files and Directories: " + str.length);
        for (String s : str)
            System.out.println(s);
    }
}
