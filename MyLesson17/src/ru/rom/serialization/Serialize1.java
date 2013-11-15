package ru.rom.serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize1 
{
    public static void main(String args[])
    {
	Employee emp = new Employee();
	emp.lName = "Roman";
	emp.fName = "Antonets";
	emp.salaryPerMonth = 100000;
	
	FileOutputStream fOut = null;
	ObjectOutputStream oOut = null;
	
	try
	{
	    fOut = new FileOutputStream("BestEmployee.ser");
	    oOut = new ObjectOutputStream(fOut);
	    
	    oOut.writeObject(emp);//serializing employee
	}
	catch (IOException e)
	{
	    //close the stream
	    try
	    {
		oOut.flush();
		oOut.close();
		fOut.close();
	    }
	    catch (IOException ioe)
	    {
		ioe.printStackTrace();
	    }
	}
	System.out.println("The employee object has been serialized into "
				+ "BestEmployee.ser");
	
	Employee empRead = new Employee();
	FileInputStream fInStr = null;
	ObjectInputStream oInStr = null;
	
	try
	{
	    fInStr = new FileInputStream("BestEmployee.ser");
	    oInStr = new ObjectInputStream(fInStr);
	    empRead = (Employee)oInStr.readObject();
	}
	catch (ClassNotFoundException cnf)
	{
	    System.out.println("Class not found");
	}
	catch (IOException e)
	{
	    try
	    {
	    oInStr.close();
	    fInStr.close();
	    }
	    catch (IOException ioe)
	    {
		ioe.printStackTrace();
		System.out.println("\n\tioe Exception occured");
	    }
	    System.out.println("\n\tIOException occured");
	    e.printStackTrace();
	}
	
	finally 
	{
	    empRead.printFields();
	    System.out.println(empRead);
	}
	
    }

}
