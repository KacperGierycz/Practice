package streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\MyPlugin\\Practice\\src\\main\\java\\streams\\xanadu.txt");
            out = new FileOutputStream("C:\\MyPlugin\\Practice\\src\\main\\java\\streams\\outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
          //      System.out.println(c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
