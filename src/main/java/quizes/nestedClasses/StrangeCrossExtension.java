package quizes.nestedClasses;

public class StrangeCrossExtension {

        class XYZ
        {
            String s = "Inner - XYZ";
        }
    }

    class XYZ extends StrangeCrossExtension
    {
        String s = "Outer - XYZ";

        class ABC extends XYZ
        {

        }
    }

