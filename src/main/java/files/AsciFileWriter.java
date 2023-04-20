package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AsciFileWriter {

    public static void main(String[] args) {


        Path file = Paths.get("./asciFile");
        Charset charset = Charset.forName("US-ASCII");
        String s = "...";


        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.write(s, 0, s.length());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        try (
                BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.write(s, 0, s.length());
        } catch (
                IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
