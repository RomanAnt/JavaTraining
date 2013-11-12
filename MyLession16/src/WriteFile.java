import java.io.FileOutputStream;
import java.io.IOException;


public class WriteFile 
{

    public static void main(String[] args) 
    {
	int[] somData = {89, 89, 9, 99, 231, 35, 12, 00};
	FileOutputStream myFile = null;
	
	try
	{
	    myFile = new FileOutputStream("adcWrite.data");
	    for(int i=0; i<somData.length; i++)
	    {
		myFile.write(somData[i]);
	    }
	}
	catch (IOException e)
	{
	    System.out.println("Could not write to a file: " 
		    + e.toString());
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
