package com.practicaljava.lesson7.tryit;




public class TestPayIcreaseInterface 
{

	public static void main(String[] args) 
	{
		Payable workers[] = new Payable[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Marie");
		workers[2] = new Employee("Stieve");
		
		
		for(Payable p : workers)
			((Payable)p).increasePay(45);

	}

}
