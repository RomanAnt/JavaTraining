package com.practicaljava.lesson7.tryit;

public class Employee implements Payable 
{
	private String name;
	
	public Employee(String nameLoc)
	{
		this.name = nameLoc;
	}

	@Override
	public boolean increasePay(int percent) 
	{
		System.out.println("\nIncreasing payments by " + percent + "% " + name);
		
		return true;
	}

}
