package inheritance.protectedOrDefault;



public class A {

    public int t = 3;

    public int getTheT(){
        return t;
    }
    protected int getTheTT(){
        return t;
    }

     protected class AA{

          private int a = 1;
          int b = 1;
          protected int c = 1;
          public int d = 1;




     }

     class AAA{

          int p = 2;

     }

     public static void main(String[] args) {

          A a = new A();
          A.AA aa = a.new AA();


     }

}
