package TestCar;

public class TestCar 
{

	public static void main(String[] args) 
	{
		Car car1 = new Car("pink",4);       //create instance of Car class using constructor with 2 fields
		CarPer car2 = new CarPer();         //instance default constructor
		Car car3 = new Car("blue");         //create instance of Car class using constructor with 1 fields and 1 value is by default
				
		//car2.color = "blue";             //assigning the field of the instance with not default value
		
		System.out.println("\nThe cars have been painted: car1 with " + car1.color
			                	+ " and car2 with " + car2.color + " colors.");
		
		System.out.println("\nThe # of doors of the car3 is " + car3.numberOfDoors + ".");
		
		car1.show("\nSuperMethod:");
		car1.show();
	}

}

