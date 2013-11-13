package jvTraining.book.listings;

public class TestStackTrace 
{
	TestStackTrace()
	{
	 try
	 {
		divideByZero();
	 }
	 catch (Exception e)
	 {
		 System.out.println("\n\tError occured");
	 }
		
	}

	int divideByZero()
	
	{
			return 1/0;
		
	}
	
	public static void main(String[] agums)
	{
		new TestStackTrace();
	}
	
}
