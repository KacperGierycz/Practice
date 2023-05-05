package files;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class ReadOccurencesOfX {


    public String printOccurences(char c, String s) {

        int occurrences = 0;
        Path p1 = Paths.get(s);
        Scanner sc = null;

        try {
            sc = new Scanner(new BufferedReader(new FileReader(p1.toFile())));
            occurrences = (int) sc.findAll(String.valueOf(c)).count();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        System.out.println("The file: " + s + " has this many: " +  occurrences +" occurrences of: " + c);
        return "The file: " + s + " has this many: " +  occurrences +" occurrences of" + c;
    }

    public static void main(String[] args) {
        ReadOccurencesOfX ro = new ReadOccurencesOfX();
        if(args.length == 0){
            ro.printOccurences('H',"C:\\Users\\kacpe\\OneDrive\\Pulpit\\tests\\WatchServiceTest\\Nowy dokument tekstowy.txt");
        }
        else {
            char c = args[0].charAt(0);
            String path = args[1];
            ro.printOccurences(c, path);
        }
    }
}