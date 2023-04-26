package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadSymLink {

    public static void main(String[] args) {

        Path p = Paths.get("foo/bar4/SLink.txt");
        Path hardl = Paths.get("foo/bar3/hardLink.txt");

        ObjectInputStream in = null;

        Path file = p;
        boolean isSymbolicLink =
                Files.isSymbolicLink(file);

        System.out.println(isSymbolicLink);

        Path link = p;
        try {
            System.out.format("Target of link" +
                            " '%s' is '%s'%n", link,
                    Files.readSymbolicLink(link));
            Files.readSymbolicLink(link);

            System.out.format("Target of link" +
                            " '%s'%n", hardl
                    );


            Scanner s = null;

            try {
                s = new Scanner(new BufferedReader(new FileReader(Files.readSymbolicLink(link).toFile())));

                while (s.hasNext()) {
                    System.out.println(s.next());
                }
            } finally {
                if (s != null) {
                    s.close();
                }
            }
            } catch (IOException x) {
            System.err.println(x);
        }

    }


}
