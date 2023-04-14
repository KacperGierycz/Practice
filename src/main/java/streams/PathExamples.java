package streams;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExamples {

    public static void main(String[] args) {

        Path p1 = Paths.get("/tmp/foo");
     //   Path p2 = Paths.get(args[0]);
        Path p3 = Paths.get(URI.create("file:///Users/joe/FileTest.java"));

        Path p4 = FileSystems.getDefault().getPath("/users/sally");

        Path p5 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");

        System.out.println(p5);



        System.out.println(p1);
    //    System.out.println(p2);
        System.out.println(p3);

        // None of these methods requires that the file corresponding
// to the Path exists.
// Microsoft Windows syntax
        Path path = Paths.get("C:\\home\\joe\\foo");

// Solaris syntax
 //       Path path = Paths.get("/home/joe/foo");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        Path pp1 = Paths.get("/home/logfile");
// Result is file:///home/logfile
        System.out.format("%s%n", pp1.toUri());


    }

}
