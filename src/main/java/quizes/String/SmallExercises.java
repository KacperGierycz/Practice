package quizes.String;

public class SmallExercises {

    public static void main(String[] args) {

        String s1 = "    ";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        String s2 = "null" + null + 1;
        System.out.println(s2);

        String s3 =   null + "null" + 1;
        System.out.println(s3);
        System.out.println("ONE" + 1 + 2 + 3 + 4 + "FIVE");
        System.out.println(7.7 + 3.3 + "JAVA" + 3.3 + 7.7);
 //       System.out.println(null + 1 + "null");
   //     System.out.println("JAVAJ2EE".substring(2,5).substring(1).charAt(2));
        System.out.println(1000 + 2000 + 3000 + 4000 + "Java");

    }

}
