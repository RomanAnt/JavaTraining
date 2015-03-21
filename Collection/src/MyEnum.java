import java.util.Enumeration;
import java.util.Hashtable;


public class MyEnum 
{
    public static void main(String argumsy[])
    {
	Enumeration en;
	Hashtable hT = new Hashtable();
	
	hT.put("drun", "john");
	hT.put("drum", "ohn");
	hT.put("dryn", "ohmy");
	
	en = hT.keys();
	
	while (en.hasMoreElements())
	{
	    System.out.println(en.nextElement() + " " + (String)hT.get(en.nextElement()));
	    //System.out.println(hT.toString());
	    en.nextElement();
	}
	
    }

}
