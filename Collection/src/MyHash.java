import java.util.Hashtable;


public class MyHash 
{
    public static void main(String args[])
    {
	Hashtable phoneBook = new Hashtable();
	phoneBook.put("Tom", "098098");
	phoneBook.put("Moy", "098");
	phoneBook.put("John", "8098");
	phoneBook.put("Mary", "098098");
	phoneBook.put("Bill", "32342098098");
	phoneBook.put("Tatiana", "09809864556");
	
	System.out.println("\n\tThe size 1 is " + phoneBook.size());
	phoneBook.remove("John");
	System.out.println("\n\tThe size 1 is " + phoneBook.size());
	System.out.println("\n\tNumber John is " + phoneBook.get("John"));
	phoneBook.clear();
	System.out.println("\n\tThe book is empty? : " + phoneBook.isEmpty());
	
	System.out.println("\n\tThe size 2 is " + phoneBook.size());
	System.out.println("\n\tNumber Moy is " + phoneBook.get("Moy"));
	System.out.println("\n\tNumber Mary is " + phoneBook.get("Mary"));
	
    }

}
