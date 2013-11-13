import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class BufferedRead {

    public static void main(String[] args) 
    {
	FileInputStream myFile = null;
	BufferedInputStream buff = null;
	
	try
	{
	    myFile = new FileInputStream("adcWrite.data");
	    buff = new BufferedInputStream(myFile);
	    
	    
	    boolean eoFile = false;
	    while (!eoFile)
	    {
		int byteValue = buff.read();
		System.out.println(byteValue + " ");
		
		if (byteValue == -1) eoFile = true;
	    }
	}
	catch (IOException e)
	{
	    System.out.println("\tWatch yourself for your errors!!!" + e.toString());
	}
	finally
	{
	    if (myFile!=null)
	    {
		try
		{
		    buff.close();
		    myFile.close();
		}
		catch (Exception e1)
		{
		    e1.printStackTrace();
		}
	    }
	}
    }

}
