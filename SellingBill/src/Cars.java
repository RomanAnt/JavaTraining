
public class Cars extends Goods {

	public Cars(String st) 
	{
		super(st);
		
	}
	
	@Override
	void sellOne() 
	{
		if (this.quant==0) System.out.println("\nSorry, there is no more " + this.name + " at the store. Sell cancelled.");
		else 
		{
			System.out.println("\n\tI've just sold one piece of " + this.name + " .");
			System.out.println("\tThere are only " + (--this.quant) + " picess of " 
												+ this.name + " stayed at the store.");
		} 
	}

	@Override
	void addOne() 
	{
		System.out.println("\n\tOne pice of car " + this.name + " just have been added to the store.");
		this.quant++;
	}

	@Override
	void howManyOnTheStore() 
	{
		System.out.println("\tThere are " + (this.quant) + " pieces of car " 
											+ this.name + " at the store totally.");
		
	}

}
