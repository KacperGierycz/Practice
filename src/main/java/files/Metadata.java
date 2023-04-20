package files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Metadata {

    public static void main(String[] args) {

   //     Path file = Paths.get("characteroutput.txt");
        Path file = Paths.get("C://MyPlugin/Practice/characteroutput.txt");
        Path toPaste = Paths.get("C://MyPlugin/Practice/ToPaste2/chars.txt");
        //   Path file = ...;
        BasicFileAttributes attr;

        try {
            Files.copy(file,toPaste,StandardCopyOption.REPLACE_EXISTING);
        //    Files.copy(toPaste,file);
         //   Files.copy(toPaste,file,NOFOLLOW_LINKS);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", file);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", file);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }

        {
            try {
                attr = Files.readAttributes(file, BasicFileAttributes.class);
                System.out.println("creationTime: " + attr.creationTime());
                System.out.println("lastAccessTime: " + attr.lastAccessTime());
                System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

                System.out.println("isDirectory: " + attr.isDirectory());
                System.out.println("isOther: " + attr.isOther());
                System.out.println("isRegularFile: " + attr.isRegularFile());
                System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
                System.out.println("size: " + attr.size());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }



}
