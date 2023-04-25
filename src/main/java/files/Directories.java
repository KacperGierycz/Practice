package files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Directories {


    class Inner{
        class InnerIn{
            class InnerInIn{
                class InnerInInIn{

                }
            }
        }

    }

    public static void main(String[] args) {


        try {
            Files.createDirectories(Paths.get("foo/bar2"));
            Files.createDirectories(Paths.get("foo/bar3"));
            Files.createDirectories(Paths.get("foo/bar4"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path dir = Paths.get("foo");
        try (DirectoryStream<Path> stream =
                     Files.newDirectoryStream(dir, "*.{java,class,jar}")) {
            for (Path entry: stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can // only be thrown by newDirectoryStream.
            System.err.println(x);
        }

//
//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
//            for (Path file: stream) {
//                System.out.println(file.getFileName());
//            }
//        } catch (IOException | DirectoryIteratorException x) {
//            // IOException can never be thrown by the iteration.
//            // In this snippet, it can only be thrown by newDirectoryStream.
//            System.err.println(x);
//        }


//        Path file = Paths.get("./filePOSIXattributes");
//
//        Set<PosixFilePermission> perms =
//                PosixFilePermissions.fromString("rwxr-x---");
//        FileAttribute<Set<PosixFilePermission>> attr =
//                PosixFilePermissions.asFileAttribute(perms);
//        try {
//            Files.createDirectory(file, attr);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        Path path = Paths.get("./directoryT");
//        try {
//            Files.createDirectory(path);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
//        for (Path name: dirs) {
//            System.err.println(name);
//        }
    }



}
