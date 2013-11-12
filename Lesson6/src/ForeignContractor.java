
import com.practicaljava.lesson6.Person;


public class ForeignContractor extends Person 
{
	public ForeignContractor (String nameLocal)
	{
		super(nameLocal);
	}
	public boolean icreasePay(int percent)
	{
		System.out.println("\nHe is just a foreign worker.");
		return true;
	}
	
}
