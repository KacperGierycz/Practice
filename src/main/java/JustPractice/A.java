package JustPractice;

class A
{
    private class B
    {
        //inner class
    }

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
    }
}

