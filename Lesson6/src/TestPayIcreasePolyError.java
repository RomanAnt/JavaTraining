import com.practicaljava.lesson6.Contractor;
import com.practicaljava.lesson6.Employee;
import com.practicaljava.lesson6.Payable;
import com.practicaljava.lesson6.Person;


public class TestPayIcreasePolyError {

	public static void main(String[] args) 
	{
		Person workers[] = new Person[4];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Marie");
		workers[2] = new Employee("Stieve");
		workers[3] = new ForeignContractor("BOrisss");
		
		for(Person p : workers)
			((Payable)p).increasePay(45);


	}

}
