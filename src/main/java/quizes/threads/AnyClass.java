package quizes.threads;
class AnyClass
{
    synchronized void methodOne()
    {
        try
        {
            wait();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }

    synchronized void methodTwo()
    {
        notifyAll();
    }
}
