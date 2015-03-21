
public class ClassMarketNews extends Thread
{
    public ClassMarketNews(String threadName)
    {
	super(threadName); //name your thread
    }
    
    public void run()
    {
	System.out.println("The stock market is improving!");
    }

}
