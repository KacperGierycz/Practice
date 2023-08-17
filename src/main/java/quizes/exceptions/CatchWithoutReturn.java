package quizes.exceptions;

public class CatchWithoutReturn {


        static String anyMethod()
        {
            String s = "ONE";

            try
            {
                s = s + "TWO";

                return s;
            }
            catch (Exception e)
            {
                s = s + "THREE";

                return s;
            }
            finally
            {
                s = s + "FOUR";
                System.out.println(s);
            }


        }

        public static void main(String[] args)
        {
            System.out.println(anyMethod());
        }
    }

