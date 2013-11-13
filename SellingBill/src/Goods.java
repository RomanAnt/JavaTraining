
public abstract class Goods 
{
	String name = ""; //name of a good
	int quant = 0;   //quantity of certain a good at the store
	public Goods(String st)
	{
		this.name = st;
	}
	
	abstract void sellOne();			//selling something
	abstract void addOne();			//adding quantity at the store
	abstract void howManyOnTheStore(); //checks the store state
	
	void giveName(String nameToGive)   // naming a good
		{
			this.name = nameToGive;
		}
	
	void printName() //trying to understand what is a good we've just sold
		{
			System.out.println("\nThe good has name: \"" + this.name + "\".");
		}
	
}
