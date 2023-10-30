package quizes.enums;

public enum AbstractMethodToOverride {

    ONE{
        @Override
        int getValue() {
            return value;
        }
    },TWO{
        @Override
        int getValue() {
            return value;
        }
    },THREE{
        @Override
        int getValue() {
            return value;
        }
    };

    private AbstractMethodToOverride(){
        ++value;
    }

    int value;
    abstract int getValue();

    public static void main(String[] args) {

        System.out.println(AbstractMethodToOverride.ONE.getValue());

        System.out.println(AbstractMethodToOverride.TWO.getValue());

        System.out.println(AbstractMethodToOverride.THREE.getValue());

    }

}
