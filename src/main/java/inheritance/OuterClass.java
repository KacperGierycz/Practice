package inheritance;

public class OuterClass {

    private int priv = 0;
    public int pub = 1;

    public int getPrivOuter(){
        return priv;
    }

    public class NestedClass{

         protected int getPriv(){

             return priv;
        }

        public int fromOuterMethod = getPrivOuter();

        public int inPub = pub;
    }




}
