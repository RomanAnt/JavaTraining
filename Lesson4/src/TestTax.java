
public class TestTax {

	public static void main(String[] args) 
	{
	double grossInc = 5020;
	String stat = "";
	int dependts = 0;
	
	Tax t = new Tax(grossInc, stat, dependts);
	
	
	//double yourTax = t.calcTax();
	 System.out.println("Your tax is " + t.calcTax() + "$" + " or " + t.Conversion() + " euros");
	 
	 
	 Tax t2 = new Tax(6500, "TX", 4);
	 System.out.println("Your tax is " + t2.calcTax() + "$" + " or " + t2.Conversion() + " euros");
	 
	 System.out.println(Tax.calcTax());       //call static method without an instance
	 System.out.println(Tax.Conversion());

	}

}
