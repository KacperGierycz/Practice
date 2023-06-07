package properties;

public class GetPersistentEcho {

    public static void main(String[] args) {
        String argString = "";
         if ((argString = System.getenv("PERSISTENTECHO")) != null) {}
        System.out.println(argString);
    }
}
