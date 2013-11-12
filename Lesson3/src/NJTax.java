

public class NJTax extends Tax
{
	public double calcTax()
	{
		return ((grossIncome<30000)?(grossIncome*0.05):(grossIncome*0.06)-500);
	}

}
