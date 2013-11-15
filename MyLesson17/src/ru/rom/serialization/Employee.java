package ru.rom.serialization;

import java.io.Serializable;

public class Employee implements Serializable
{
    String lName = "";
    String fName = "";
    int salary = 0;
    public int salaryPerMonth;
    
    public void printFields()
    {
	System.out.println("\tlName = " + this.lName);
	System.out.println("\tfName = " + this.fName);
	System.out.println("\tsalaryPerMonth = " + this.salaryPerMonth);
    }
}
