package com.practicaljava.lesson6;

public class Person 
{
	private String name;
	
	{System.out.println("It's after the var init");}//#1
	
	public Person()
	{
		System.out.println("\tIt's inside the Person default constructor");//#4
	}
	
	public Person(String name)
	{
		this.name = name;
		System.out.println("\tIt's inside the Person NameConstructor");
	}
	
	{System.out.println("It's after the Person constructor");}//#2
	
	public String getName()
	{
		System.out.println("\tIt's inside the getName method");
		return "Person's name is " + name;
	}
	
	{System.out.println("It's from the bottom of the class body");}//#3
}
