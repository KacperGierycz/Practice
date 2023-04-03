package exceptions;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entered try statement");
 //           FileWriter f = new FileWriter("OutFile.txt");
  //          out = new PrintWriter(f);
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        catch and finally blocks  . . .
    }
}