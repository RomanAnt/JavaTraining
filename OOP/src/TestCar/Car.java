package TestCar;

public class Car extends CarPer
{
	String color;
	int numberOfDoors;
	
	Car(String clr, int nod)
	{
		color = clr;
		numberOfDoors = nod;
	}
	Car(String clr)
	{
		this.color = clr;
		numberOfDoors = 4;
	}
	
	void show()
	{
		System.out.print("color is undefined," + " number of doors is unknown");
	}
	
}
