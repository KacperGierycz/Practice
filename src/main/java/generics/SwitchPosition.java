package generics;

import java.util.Arrays;

public class SwitchPosition {

    public <T> void  swaper(T[] a, int b, int c){

        if(a.length > 1 && b!=c && b>=0 && c>=0){

            T dd = a[b];
            a[b] = a[c];
            a[c] = dd;

        }

    }

    public static void main(String[] args) {
        Integer[] ar= {1,2};
        SwitchPosition sp =new SwitchPosition();
        sp.swaper(ar,1,0);
        System.out.println(ar[0] + " "+ ar[1]);

        String [] ars = {"ooooo", "paaaa"};
        sp.swaper(ars,1,0);
        System.out.println(ars[0] + " "+ ars[1]);

    }

}
