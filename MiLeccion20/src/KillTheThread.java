
public class KillTheThread 
{
    public static void main (String args[])
    {
	Portfolio4 p = new Portfolio4("Portfolio data");
	p.start();
	
	p.stopMe();
	
    }
}


class Portfolio4 extends Thread
{
    private volatile Thread stopMe = Thread.currentThread();
    
    public void stopMe()
    {
	stopMe = null;
    }
    
    public void run()
    {
	while( stopMe == Thread.currentThread())
	{
	    try
	    {
		System.out.println("\ninside the try");
	    }
	    catch (InterruptedException e)
	    {
		System.out.println(Thread.currentThread().getName() + e.toString());
	    }
	}
    }
}
