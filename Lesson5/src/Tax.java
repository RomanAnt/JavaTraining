
public class Tax 
{
	static double grossIncome = 0;
	String state = "";
	static int dependents = 0;
	static int customerCounter = 0;
	
	Tax (double gI, String st, int dep)//class constructor
	{
		grossIncome = gI;
		this.state = st;
		dependents = dep;
		customerCounter++;
		System.out.println("\n\tPrepering the tax data for customer # " + customerCounter);
	}
	
	Tax (double grossIncome, int dependents)
	{
		this(grossIncome, "NY", dependents);
	}
	
	static double calcTax()
	{
		return (grossIncome*0.33 - dependents*100);
	}
	
	static double Conversion()
	{
		return calcTax()*1.25;
	}

}
