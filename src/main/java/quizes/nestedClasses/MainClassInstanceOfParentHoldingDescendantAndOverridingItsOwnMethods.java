package quizes.nestedClasses;

public class MainClassInstanceOfParentHoldingDescendantAndOverridingItsOwnMethods {
    public static void main(String[] args) {
        InstanceOfParentHoldingDescendantAndOverridingItsOwnMethods.InnerClassOne one
                = new InstanceOfParentHoldingDescendantAndOverridingItsOwnMethods.InnerClassOne();

        System.out.println(one.getI());

        one = new InstanceOfParentHoldingDescendantAndOverridingItsOwnMethods.InnerClassTwo();

        System.out.println(one.getI());



    }
}
