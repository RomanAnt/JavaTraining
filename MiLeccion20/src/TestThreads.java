
public class TestThreads 
{

    public static void main(String[] args) 
    {
	ClassMarketNews mn = new ClassMarketNews("Market News");
	mn.start();
	
	Portfolio p = new Portfolio("Portfolio data");
	p.start();
	
	System.out.println("\tTestThreads is finished");

    }

}
