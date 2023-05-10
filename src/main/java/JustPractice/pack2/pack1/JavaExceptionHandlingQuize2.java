package JustPractice.pack2.pack1;





public class JavaExceptionHandlingQuize2 {
    public static void main(String[] args) {
        String[] arr = getInfo();
        for (String i : arr) {
            System.out.println(i);
        }
    }

    public static String[] getInfo() {
        String[] arr = new String[3];
        try {
            arr[0] = "try";
            return arr;
        } catch (Exception e) {
            arr[1] = "catch";
            return arr;
        } finally {
            arr[2] = "finally";
            return arr;
        }
    }
}