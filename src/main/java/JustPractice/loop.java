package JustPractice;

public class loop {

    class WhileDemo {
        public static void main(String[] args){
            int count = 1;
            boolean joy = false;
            while (count < 11) {
                System.out.println("Count is: " + count);
                count++;

                if(!joy){
                    System.out.println("joy is false");
                }

                while (!joy){
                    System.out.println(joy);
                    break;
                }
            }
            System.out.println(joy);
        }
    }

    public static void main(String[] args) {
        int count = 1;
        boolean joy = false;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
            while (!joy){
                System.out.println(joy);
                break;
            }
        }
    }

}
