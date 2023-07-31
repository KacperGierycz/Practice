package collections.exercises;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Final {

    //helper methods with one think to do
    //1 read the file
    //2

    public static void main(String[] args)  {
        System.out.println("Specify path to the file in first arg... and number of lines to read in second.");
// C:\\MyPlugin\\Practice\\FinalCollectionImplementation.txt
        Path path = null;
        if(args.length>0) {

            path = Path.of(args[0]);
        }
        else{
            System.out.println("Argument not present.");
            System.exit(0);
        }
        System.out.println(path.toString());
        File file = new File(String.valueOf(path));
        long NUMBER_OF_LINES = file.length();
        double assumedLineLength = 20;
        double lengthOfDatastructures = NUMBER_OF_LINES/assumedLineLength;
        List<String> fileIntoList = new ArrayList<>((int) lengthOfDatastructures);

        try(BufferedReader reader =
                new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                fileIntoList.add(line);
            }

                } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        fileIntoList.stream()
//                .forEach(System.out::println);

        Integer numberOfDisplays = Integer.valueOf(args[1]);
        System.out.println(numberOfDisplays);

        ArrayList<Integer> linesToDisplay = new ArrayList<>();
        Random random = new Random();
        for( int i = 0; i<numberOfDisplays; i++){
            int randomNumberOfLineToPrint = random.nextInt(fileIntoList.size());
    //        System.out.println(randomNumberOfLineToPrint);
            System.out.println(fileIntoList.get(randomNumberOfLineToPrint));

        }



    }


}
