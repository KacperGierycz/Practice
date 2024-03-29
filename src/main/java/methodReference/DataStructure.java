package methodReference;

public class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void print(DataStructureIterator iterator){

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(java.util.function.Function<Integer, Boolean> iterator){

        int t=0;
        for(Integer i : arrayOfInts){

            if(iterator.apply(t)){
                System.out.print(i + " ");
            }
            t++;
        }
        System.out.println();

    }
    public static Boolean isEvenIndex(Integer x){


            if(x%2==0) {
                return true;
            }
            else {
                return false;
            }

    }

    public static Boolean isOddIndex(Integer x){
        if(x%2!=0) {
            return true;
        }
        else {
            return false;
        }

    }

    private DataStructureIterator getDataStructureIterator(){
        return new EvenIterator();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
        DataStructureIterator iterator = ds.new EvenIterator();
        ds.print(iterator);
        ds.print(new DataStructureIterator() {
            // Start stepping through the array from the beginning
            private int nextIndex = 1;

            public boolean hasNext() {

                // Check if the current element is the last in the array
                return (nextIndex <= SIZE - 1);
            }

            public Integer next() {

                // Record a value of an even index of the array
                Integer retValue = Integer.valueOf(ds.arrayOfInts[nextIndex]);

                // Get the next even element
                nextIndex += 2;
                return retValue;
            }
        });

        ds.print(p -> p%2 == 0);
        ds.print(p -> p%2 != 0);

        System.out.println( "Printing with method reference");

        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);

    }
}
