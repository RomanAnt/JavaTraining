package javaApprender;

public class BeerBottleSong {

	public static void main(String[] args) 
	{
	
	int NumBottles = 9;
	
	
	while (NumBottles>=1)
	{
				
		System.out.println(NumBottles + "" + chooseRightWord(NumBottles) + " пива на столе,");
		System.out.println("Возьми одну свою подругу.");
		NumBottles = NumBottles - 1;
		if (NumBottles > 0)
			System.out.println(NumBottles + "" + chooseRightWord(NumBottles) + " пива на столе."+ "\n");
		else 
			System.out.println("Нету пива на столе."+ "\n");
	}
		
	}

	private static String chooseRightWord(int NumBottles)
	{
		String word="";
		if (NumBottles==1) word = " бутылка";
		if ((NumBottles<=4)&&(NumBottles>=2)) word = " бутылки";
		if(NumBottles >= 5) word= " бутылок";
		return word;
	}

}
