package number;

import org.w3c.dom.ls.LSOutput;

public class TrigonometricDemo {
    public static void main(String[] args) {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi " + "is %.4f%n",
                Math.PI);

        System.out.format("The sine of %.1f " + "degrees is %.4f%n",
                degrees, Math.sin(radians));

        System.out.format("The cosine of %.1f " + "degrees is %.4f%n",
                degrees, Math.cos(radians));

        System.out.format("The tangent of %.1f " + "degrees is %.4f%n",
                degrees, Math.tan(radians));

        System.out.format("The arcsine of %.4f " + "is %.4f degrees %n",
                Math.sin(radians),
                Math.toDegrees(Math.asin(Math.sin(radians))));

        System.out.format("The arccosine of %.4f " + "is %.4f degrees %n",
                Math.cos(radians),
                Math.toDegrees(Math.acos(Math.cos(radians))));

        System.out.format("The arctangent of %.4f " + "is %.4f degrees %n",
                Math.tan(radians),
                Math.toDegrees(Math.atan(Math.tan(radians))));
        double number = (Math.random() );
        System.out.format("The random of %.10f " + "is %d in *10 %n",
                number,
                (int)number*10);

        int x = 65;
        System.out.println(Integer.toHexString(x));

        String base5String = "230";
        int result = Integer.valueOf(base5String, 5);
        System.out.println(result);

        Double d = 2.22d;
        Double dd = 0.0/0.0;
        System.out.println(Double.isNaN(d)+" "+ Double.isNaN(dd));

        System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));



    }


}
