
public class ShopGame 
{
	public static void main(String[] args) 
	{
		Goods good[] = new Goods[3];
			good[0] = new Cars("Toyota");
			good[1] = new Fuel("Gas");
			good[2] = new Cars("Honda");
			
			
			
			for(Goods gd : good)
			{
				gd.printName();
				gd.addOne();
			}
		
		Cars toyota = new Cars("Toyota");
		Cars ford = new Cars("Ford");
		Fuel gasoline = new Fuel("Gasoline");
		Fuel gas = new Fuel("Gas");
		
		toyota.quant = 1;
		ford.quant = 15;
		gasoline.quant = 300;
		gas.quant = 800;
				
		
		
		gas.addOne();
		gas.howManyOnTheStore();
		
		for (int i=0;i<2;i++)
		{
			toyota.sellOne();
			gasoline.sellOne();
		}

	}

}
