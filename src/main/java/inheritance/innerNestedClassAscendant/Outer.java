package inheritance.innerNestedClassAscendant;

public class Outer {

    private String name = "Kacper";

    public class InnerClass{

        protected String innerName = "Patryk";

        String getPrivateName(){
            return name;
        }
    }

    public class InnerClassExtended extends InnerClass{
        public String ICExtended = "Works";
    }

}
