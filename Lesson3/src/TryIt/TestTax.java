package TryIt;


public class TestTax 
{

	public static void main(String[] args) 
	{
		final double INCOME = 60000.248;//input the value
		
		Tax t = new Tax();//creating instances
		//Tax njt = new NJTax();
		
		t.grossIncome = INCOME;//assigning values
		t.dependents = 2;
		t.state = "NY";
		
		//double yourTax = t.calcTax();
		
		System.out.println("\n\tIf you tell that your income was " + INCOME + " of anything, then :");
		System.out.println("\n\t\t- we believe that " + formatDouble (t.calcTax(), 2) + " of the same belongs to us.");
		
		
	}
		public static double formatDouble(double d, int dz) //rounding to 2 digits
		{ 
		 double dd = Math.pow(10,dz); 
		 return Math.round(d*dd)/dd; 
		}
}
