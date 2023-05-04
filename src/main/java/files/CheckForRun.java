package files;

import org.w3c.dom.ls.LSOutput;

public class CheckForRun {

    public static void main(String[] args) {
        System.out.println("it's OK");
    }

    public class App {
        void calcBill() {
             class Invoice {
               void print(){
                   System.out.println("it's OK");
               }
            }
            new Invoice().print();
        }
    }
}
