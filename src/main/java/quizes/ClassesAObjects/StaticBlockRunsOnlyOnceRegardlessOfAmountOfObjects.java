package quizes.ClassesAObjects;

public class StaticBlockRunsOnlyOnceRegardlessOfAmountOfObjects {

        {
            System.out.println(1);
        }

        static
        {
            System.out.println(2);
        }

        public StaticBlockRunsOnlyOnceRegardlessOfAmountOfObjects(int i)
        {
            System.out.println(3);
        }

        public StaticBlockRunsOnlyOnceRegardlessOfAmountOfObjects()
        {
            System.out.println(4);
        }
    }


