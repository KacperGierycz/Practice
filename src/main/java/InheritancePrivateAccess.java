import inheritance.OuterClass;

public class InheritancePrivateAccess extends OuterClass.NestedClass {

    public InheritancePrivateAccess(){
        new OuterClass().super();


    }
    int in= super.inPub;
    int fromMetod = getPriv();
    int fromOuter = fromOuterMethod;



}
