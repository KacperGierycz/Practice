package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HardLink {

    public static void main(String[] args) {

        Path newLink = Paths.get("foo/bar3/hardLink");
        Path existingFile = Paths.get("foo/SLink.txt");
        try {
            Files.createLink(newLink, existingFile);
        } catch (IOException x) {
            System.err.println(x);
        } catch (UnsupportedOperationException x) {
            // Some file systems do not
            // support adding an existing
            // file to a directory.
            System.err.println(x);
        }
    }

}
