package quizes.nestedClasses;

public class MainClassScopeForThisNotFromSurroundingClass {
    public static void main(String[] args) {
        ScopeForThisNotFromSurroundingClass abc = new ScopeForThisNotFromSurroundingClass();

        System.out.println(abc.i);

        ScopeForThisNotFromSurroundingClass.XYZ xyz = abc.new XYZ();

        System.out.println(xyz.i);

        ScopeForThisNotFromSurroundingClass.XYZ xyz1 = new ScopeForThisNotFromSurroundingClass().new XYZ();

        System.out.println(xyz1.i);
    }
}
