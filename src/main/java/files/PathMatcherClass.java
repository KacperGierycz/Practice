package files;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.PathMatcher;

public class PathMatcherClass {

    public static void main(String[] args) {


//        PathMatcher matcher =
//              FileSystems.getDefault().getPathMatcher("glob:*.{java,class}");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.{java,class}");

        Path filename = Paths.get("src/main/java/files/Copy.java");
        Path absoluteF = filename.toAbsolutePath();
 //       System.out.println(filename);
        if (matcher.matches(filename)) {
            System.out.println(filename);
        }

    }

}
