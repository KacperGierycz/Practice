package quizes.MethodOverloadingAndOverriding;

import java.sql.SQLException;

public class IsSqlExceptionViableInSubClass {

    class A
    {
        void myMethod()
        {
            System.out.println("Super Class");
        }
    }

    class B extends A
    {
//        @Override
//        void myMethod() throws SQLException
//        {
//            System.out.println("Sub Class");
//        }
    }

}
