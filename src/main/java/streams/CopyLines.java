package streams;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("C:\\MyPlugin\\Practice\\src\\main\\java\\streams\\xanadu.txt"));
            outputStream = new BufferedWriter(new FileWriter("C:\\MyPlugin\\Practice\\src\\main\\java\\streams\\outagain.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println(l);
                outputStream.write(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
