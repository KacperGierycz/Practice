package quizes.accessModifiers.pack1;

public class ProtectedConstructor {

    protected ProtectedConstructor(){

    }

    protected ProtectedConstructor(int i){
        System.out.println(i);
    }

    ProtectedConstructor protectedConstructor = new ProtectedConstructor();

}
