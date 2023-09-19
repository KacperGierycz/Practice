package quizes.nestedClasses;

public class MainClassInstantiationOfStaticClass {
    public static void main(String[] args) {
        InstantiationOfStaticClass x = new InstantiationOfStaticClass();

        InstantiationOfStaticClass x2 = new InstantiationOfStaticClass();

        InstantiationOfStaticClass.Y y = new InstantiationOfStaticClass.Y();
    }
}
