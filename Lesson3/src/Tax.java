

public class Tax 
{
	double grossIncome = 0;
	String state = "";
	int dependents = 0;
	
	public double calcTax()
	{
		return ((grossIncome<30000)?(grossIncome*0.05):(grossIncome*0.06));
	}
}
