package quizes;

import java.util.Properties;

public class Vendor {

    public static void main(String[] args) {
        Properties defaultProps = new Properties();
        System.out.println(defaultProps);
        System.out.println(System.getProperty("java.vendor"));
    }
}
