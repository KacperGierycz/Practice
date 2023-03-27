package inheritance.innerNestedClassAscendant;


public class NestedDescendant extends Outer.InnerClass {

    NestedDescendant(){
        new Outer().super();
    }

    public String getFromSuperProtected(){

        return getPrivateName();
    }
}
