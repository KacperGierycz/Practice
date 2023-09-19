package quizes.nestedClasses;

public class ScopeForThisNotFromSurroundingClass {

        int i = 10101;

        {
            i--;
        }

        public ScopeForThisNotFromSurroundingClass()
        {
            --i;
        }

        class XYZ
        {
            int i = ScopeForThisNotFromSurroundingClass.this.i;

            {
                i++;
            }

            public XYZ()
            {
                ++i;
            }
        }
    }


