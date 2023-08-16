package quizes.exceptions;

public class ReturnExecutedTwicePropably {

        static int anyMethod()
        {
            int i = 1;

            try
            {
                i = i / 0;

                return i;
            }
            catch (Exception e)
            {
                i = i + 1;
                System.out.println("RETURN");
                return i;
            }
            finally
            {
                i = i + 2;
                System.out.println("NO RETURN");

            }


        }

        public static void main(String[] args)
        {
            System.out.println(anyMethod());
        }
    }


