package com.IndianBank.deposit;

public class Ic //class
{
	Ic () // constructor
	{
		System.out.println("im a constructor method");
	}
	int val=1;  //global varaible
	
	public static void main(String [] args) //main method
	{
		Ic acc=new Ic(); //obj
		acc.cam();    
		System.out.println(acc.val);
	}
	void cam() //method 
	{
		System.out.println("im a cam method");
	
	}
}