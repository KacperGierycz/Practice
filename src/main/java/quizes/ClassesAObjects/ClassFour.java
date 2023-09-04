package quizes.ClassesAObjects;

public class ClassFour {
    {
        System.out.println(5);
    }

    public static void main(String[] args) {
        System.out.println(6);

        InClassWithMainInstanceBlockDoNotWorkWithoutObjectCreation one = new InClassWithMainInstanceBlockDoNotWorkWithoutObjectCreation();

        InClassWithMainInstanceBlockDoNotWorkWithoutObjectCreation two = new InClassWithMainInstanceBlockDoNotWorkWithoutObjectCreation(10);
    }


}
