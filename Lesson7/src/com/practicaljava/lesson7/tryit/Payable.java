package com.practicaljava.lesson7.tryit;

public interface Payable 
{
	boolean increasePay(int percent);
	final int INCREASE_CAP = 20;

}
