package application;
import java.io.File;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = "\"C:\\Users\\Pedro Leotte Bersch\\Desktop\\JAVA Udemy\\files\\fileReaderAndBufferReader\\in.txt\"";
        File path = new File(strPath);
        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getName: " + path.getName());
        sc.close();
    }
}