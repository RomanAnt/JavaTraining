package com.practicaljava.lesson7.tryit;

public class Contractor implements Payable 
{
private String name;
	
	public Contractor(String nameLoc)
	{
		this.name = nameLoc;
	}

	@Override
	public boolean increasePay(int percent) 
	{
		if (percent < Payable.INCREASE_CAP)
		{
			System.out.println("\nIncreasing hourly rate by " + percent + "% " + name);
			return true;
		}
		else 
		{
			System.out.println("\nSorry, can't increase hourly rate more then " + Payable.INCREASE_CAP + "% " + "for " + name);
			return false;
		}
		
		
		// TODO Auto-generated method stub
		
	}

}
