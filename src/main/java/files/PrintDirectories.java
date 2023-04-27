package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintDirectories {

    public static void main(String[] args) {


        Path dir = Paths.get("C:/MyPlugin/Practice");
        Path dir2 = dir.toAbsolutePath();
        Path dir3 = Paths.get("foo/bar3/hardLink");
        System.out.println(Files.isDirectory(dir3));
        System.out.println(dir2);
        System.out.println(dir);
        Path filename = Paths.get("src/main/java/files");
        Path absoluteF = filename.toAbsolutePath();
        try (
                DirectoryStream<Path> stream =
                        Files.newDirectoryStream(absoluteF, "*.*")) {
            System.out.println(stream);
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (
                IOException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can // only be thrown by newDirectoryStream.
            System.err.println(x);
        }
    }

}
