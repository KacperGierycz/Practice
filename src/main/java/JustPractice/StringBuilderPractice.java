package JustPractice;

public class StringBuilderPractice {

    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder(5);
//        System.out.println(sb);
//        String asd = "asd";
//        asd.replace("a","c");

                String ta = "A ";
                ta = ta.concat("B ");
                String tb = "C ";
                ta = ta.concat(tb);
                System.out.println(ta);
                ta = ta.replace('C','D');
                System.out.println(ta);
                ta = ta.concat(tb);
                System.out.println(ta);

                int num = 5;
                 do {
                     System.out.println(num--);
                   //  System.out.print(num-- + " ");
                 }while (num == 0);


    }
}
