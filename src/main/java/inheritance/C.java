package inheritance;

import inheritance.protectedConstructor.A;

public class C extends A {

public C(){
    super();
}

//A a = new A(); we can't instantiate class with only protected constructor outside the package


}
