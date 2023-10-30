package quizes.enums;

 public class CodeToPrintAllConstantsOfEnum {

    enum Enums
    {
        ABC, PQR, XYZ;
    }

        public static void main(String[] args)
        {
            Enums[] enums = CodeToPrintAllConstantsOfEnum.Enums.values();

            for (Enums enumConstant : enums)
            {
                System.out.println(enumConstant);
            }
        }


}
