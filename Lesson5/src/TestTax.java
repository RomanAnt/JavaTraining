
public class TestTax {

	public static void main(String[] args) 
	{
		if (args.length != 3) 
		{			
			System.out.println("Sample usage of the program :" + "java 50000 NY 2");
			System.exit(0);
		
		}
	double grossInc = Double.parseDouble(args[0]);
	String stat = args[1];
	int dependts = Integer.parseInt(args[2]);
	
		
		
	Tax t = new Tax(grossInc, stat, dependts);
	
	
	//double yourTax = t.calcTax();
	 System.out.println("Your tax is " + t.calcTax() + "$" + " or " + t.Conversion() + " euros");
	 
	 
	 Tax t2 = new Tax(6500, "TX", 4);
	 System.out.println("Your tax is " + t2.calcTax() + "$" + " or " + t2.Conversion() + " euros");
	 
	 System.out.println(Tax.calcTax());       //call static method without an instance
	 System.out.println(Tax.Conversion());

	}

}
