package quizes.inheritance;


    class MyAnswerWasGood1
    {
         int i = 111;

         int j = 222;

        {
            i = i++ - ++j;
        }
    }

     class MyAnswerWasGood2 extends MyAnswerWasGood1
    {
        {
            j = i-- + --j;
        }
    }




