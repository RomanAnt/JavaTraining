
public class PhoneNum 
{
	public static void main (String args[])
	{
		String phone="(231)-3434-3434-949";
		phone=phone.replace("-", "").replace("(", "").replace(")", "");		
		System.out.println(phone);
	}

}
