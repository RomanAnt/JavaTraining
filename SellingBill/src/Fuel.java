
public class Fuel extends Goods {

	public Fuel(String st) 
	{
		super(st);
	}

	@Override
	void sellOne() {
		if (this.quant==0) System.out.println("\nSorry, there is no more " + this.name + " at the store. Sell cancelled.");
		else 
		{
			System.out.println("\n\tI've just sold one hundred gallons of the fuel " + this.name + " .");
		
		    System.out.println("\tThere are only " + (this.quant-=100) + " gallons of " 
												+ this.name + " stayed at the store.");
		}

	}

	@Override
	void addOne() 
	{
		System.out.println("\n\tOne hundred gallons of the fuel " + this.name + " just have been added to the store.");
		
		this.quant+=100;
	}

	@Override
	void howManyOnTheStore() 
	{
		System.out.println("\tThere are " + (this.quant) + " gallons of " 
				+ this.name + " at the store totally.");
		
	}

}
