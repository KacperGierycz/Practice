package files;

import java.io.IOException;
import java.nio.file.*;

public class Delete {

    public static void main(String[] args) {

        Path dir = Paths.get("foo/bar2");

        try {
            Files.delete(dir);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", dir);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", dir);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }


    }
}
