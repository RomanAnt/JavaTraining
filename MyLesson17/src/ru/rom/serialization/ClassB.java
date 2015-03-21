package ru.rom.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ClassB
{
    public static void main(String args[])
    {
	FileInputStream fIn = null;
	ObjectInputStream oIn = null;
	
	try
	{
	    fIn = new FileInputStream("BestEmployee.ser");
	    oIn = new ObjectInputStream(fIn);
	    
	    Employee bestEmp = (Employee)oIn.readObject();
	    bestEmp.printFields();
	}
	catch (ClassNotFoundException cnf)
	{
	    cnf.printStackTrace();
	}
	
	catch (IOException e)
	{
	    e.printStackTrace();
	}
	try
	{
	    oIn.close();
	    fIn.close();
	}
	catch (IOException ioe)
	{
	    ioe.printStackTrace();
	}
	
	System.out.println("\tThe employee object has been deserialized");
	
    }

}
