package files;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadBigFile {

    public static void main(String[] args) {


        Path p1 = Paths.get("C:/Users/kacpe/OneDrive/Pulpit/tests/WatchServiceTest/Nowy dokument tekstowy.txt");

        SeekableByteChannel seekeble;

        {
            try {
                seekeble = Files.newByteChannel(p1);
                long size = seekeble.size();
                final int BUFFER_CAPACITY = 10;
                ByteBuffer buf = ByteBuffer.allocate(BUFFER_CAPACITY);
                String encoding = System.getProperty("file.encoding");

                while (seekeble.read(buf) > 0) {

                    buf.flip();
                    System.out.print(Charset.forName(encoding).decode(buf));
                    System.out.println(1);
                    buf.clear();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
