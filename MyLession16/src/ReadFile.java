import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadFile 
{

    public static void main(String[] args) 
    {FileInputStream myFile=null;
	try {
	    myFile = new FileInputStream("abcdat.data");
	    boolean eoFile = false;
	    
	    while (!eoFile)
	    {
	        int byteValue = myFile.read();
	        System.out.print(byteValue + ", ");
	        if (byteValue == -1)
	        {
	    	eoFile = true;
	        }
	    }
	} 
	catch (IOException e) {
	    System.out.println("Could not read file " +
	    e.toString());
	}
	finally 
	{
	    if(myFile != null)
	    {
		try
		{
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
