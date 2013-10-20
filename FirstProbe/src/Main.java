
public class Main 
{

	public static void main(String[] args) 
	{
		java.util.Random rand = new java.util.Random();
		for (int i = 0; i < 10; i++) 
		{
			if (i == 9)
				System.out.print(Math.abs(rand.nextInt()) % 11 + ".");
			else
				System.out.print(Math.abs(rand.nextInt()) % 11 + ",");
		}
	}

}
