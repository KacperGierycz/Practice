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





        System.out.println( "value of y: "+ y +"\n"  + "value of yy is: " + yy + "\n" +"value of x: "+ x +"\n" + "value of xx: "+ xx +"\n");


    }
}
