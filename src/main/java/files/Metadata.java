package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Metadata {

    public static void main(String[] args) {

        Path file = Paths.get("characteroutput.txt");
        //   Path file = ...;
        BasicFileAttributes attr;

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
