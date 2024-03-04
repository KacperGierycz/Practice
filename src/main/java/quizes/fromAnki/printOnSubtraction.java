package quizes.fromAnki;

public class printOnSubtraction {

        int k = 5;
        public boolean checkIt(int k) {
            return k-- > 0 ? true : false; // this is a shadowing
        }
        public void printThem() {
            while (checkIt(k)) {
                System.out.print(k--);
            }
        }
        public static void main(String[] args) {
            new printOnSubtraction().printThem();

        }


}
