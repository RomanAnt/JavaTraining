package javaApprender;

public class BeerBottleSong {

	public static void main(String[] args) 
	{
	
	int NumBottles = 9;
	
	
	while (NumBottles>=1)
	{
				
		System.out.println(NumBottles + "" + chooseRightWord(NumBottles) + " ���� �� �����,");
		System.out.println("������ ���� ���� �������.");
		NumBottles = NumBottles - 1;
		if (NumBottles > 0)
			System.out.println(NumBottles + "" + chooseRightWord(NumBottles) + " ���� �� �����."+ "\n");
		else 
			System.out.println("���� ���� �� �����."+ "\n");
	}
		
	}

	private static String chooseRightWord(int NumBottles)
	{
		String word="";
		if (NumBottles==1) word = " �������";
		if ((NumBottles<=4)&&(NumBottles>=2)) word = " �������";
		if(NumBottles >= 5) word= " �������";
		return word;
	}

}
