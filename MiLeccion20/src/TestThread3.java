
public class TestThread3 
{
    public static void main(String argums[])
    {
	MarketNews3 mn = new MarketNews3("MarketNews");
	mn.start();
	//mn.interrupt();
	
	Portfolio3 p = new Portfolio3("Portfolio data");
	p.start();
	
	System.out.println("\nThe main method of TestThread3 is finished");
    }

}
