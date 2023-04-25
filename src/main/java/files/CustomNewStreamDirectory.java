package files;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomNewStreamDirectory {


    static Path path = Paths.get("foo");


    static DirectoryStream.Filter<Path> filter =
            new DirectoryStream.Filter<Path>() {
        public boolean accept(Path file) throws IOException {
            try {
                return (Files.isDirectory(path));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
//            catch (IOException x) {
//                // Failed to determine if it's a directory.
//                System.err.println(x);
//                return false;
//            }
        }
    };

    public static void main(String[] args) {

//         final String dataFile = "foo/dataInDir.txt";
//
//        ObjectOutputStream out = null;
//        try {
//            out = new ObjectOutputStream(new
//                    BufferedOutputStream(new FileOutputStream(dataFile)));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        Path dir = Paths.get("foo");
        try (DirectoryStream<Path>
                     stream = Files.newDirectoryStream(dir, filter)) {
            for (Path entry: stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException x) {
            System.err.println(x);
        }

    }


}
