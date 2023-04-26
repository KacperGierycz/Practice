package files;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class SymbolicLink {

    public static void main(String[] args) {

        // Convert the string to a
        // byte array.
        String s = "Symbolic Link Creation";
        byte data[] = s.getBytes();
        Path p = Paths.get("foo/SLink.txt");

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
        } catch (IOException x) {
            System.err.println(x);
        }

//        System.out.println("after catch");

        Path newLink = Paths.get("foo/bar4/SLink.txt");
        Path target = p;
        try {
            Files.createSymbolicLink(newLink, target);
        } catch (IOException x) {
            System.err.println(x);
        } catch (UnsupportedOperationException x) {
            // Some file systems do not support symbolic links.
            System.err.println(x);
        }
    }

}
