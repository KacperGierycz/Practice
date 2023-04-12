package number;

public class ReferencesAndPrimitives {

    static class IntIn{
        int x;
        int y;
    }

    public static void main(String[] args) {

        int x = 1;
        int y = x;
        x = 2;

        Integer xx = 1;
        Integer yy = xx;
        xx = 2;

 //       Integer xxx = new Integer(1);
        Integer xxx = Integer.valueOf(1);
        Integer yyy = xxx;
        xxx = 1;
        System.out.println(xxx == yyy);
        System.out.println(    xxx.compareTo(yyy));




        System.out.println( "value of y: "+ y +"\n"  + "value of yy is: " + yy + "\n" +"value of x: "+ x +"\n" + "value of xx: "+ xx +"\n");


    }
}
