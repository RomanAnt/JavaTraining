package com.practicaljava.lesson6;

public interface Payable 
{
	boolean increasePay(int percent);
	final int INCREASE_CAP = 20;

}
