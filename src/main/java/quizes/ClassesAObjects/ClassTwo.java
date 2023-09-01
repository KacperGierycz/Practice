package quizes.ClassesAObjects;

public class ClassTwo {
    {
        System.out.println(5);
    }

    public static void main(String[] args) {
        System.out.println(6);

        StaticBlockRunsOnlyOnceRegardlessOfAmountOfObjects one = new StaticBlockRunsOnlyOnceRegardlessOfAmountOfObjects();

        StaticBlockRunsOnlyOnceRegardlessOfAmountOfObjects two = new StaticBlockRunsOnlyOnceRegardlessOfAmountOfObjects(10);
    }
}
