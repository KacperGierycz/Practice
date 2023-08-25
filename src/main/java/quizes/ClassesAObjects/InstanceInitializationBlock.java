package quizes.ClassesAObjects;

public class InstanceInitializationBlock {

    public InstanceInitializationBlock()
    {
        System.out.println(2);
    }

        {
            System.out.println(1);
        }



        public static void main(String[] args)
        {
            System.out.println(3);

            InstanceInitializationBlock a = new InstanceInitializationBlock();
        }


}
