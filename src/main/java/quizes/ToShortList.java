package quizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToShortList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(new Integer[]{1,2,3});
        Integer[] arr = new Integer[]{1,2};
        Integer integer = arr[3];

        for(int x = 1;x< args.length;x++){
            System.out.println(args[x]);
        }
    }
}
