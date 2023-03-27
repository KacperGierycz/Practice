package inheritance.innerNestedClassAscendant;

public class InnerRunner {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InnerClassExtended innerClassExtended = outer. new InnerClassExtended();
        String icExtended = innerClassExtended.ICExtended;
    }
}
