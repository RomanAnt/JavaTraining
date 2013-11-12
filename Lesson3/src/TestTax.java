

public class TestTax 
{

	public static void main(String[] args) 
	{
		final double INCOME = 30000.57;//input the value
		
		Tax t = new Tax();//creating instances
		Tax njt = new NJTax();
		
		njt.grossIncome = t.grossIncome = INCOME;//assigning the fields with values
		t.dependents = 2;
		t.state = "NY";
		
		//double yourTax = t.calcTax();
		
		System.out.println("\n\tIf your income for last century was " + INCOME + " chatls, then :");
		System.out.println("\n\t- your simple tax is " + formatDouble (t.calcTax(), 2));
		System.out.println("\n\t- your NJtax is " + (float)njt.calcTax());//usage of type casting(just for not to forget)
		
		
	}
		public static double formatDouble(double d, int dz) //rounding to 2 digits
		{ 
		 double dd = Math.pow(10,dz); 
		 return Math.round(d*dd)/dd; 
		}
}
