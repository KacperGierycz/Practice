package quizes.nestedClasses;

public class AccessNestedClass {

    class ABC
    {
        class XYZ
        {
            int i = 111;
        }
    }

    public static void main(String[] args) {
        AccessNestedClass.ABC.XYZ xyz = new AccessNestedClass().new ABC().new XYZ();
    }
}
