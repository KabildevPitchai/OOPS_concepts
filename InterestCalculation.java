package com.IndianBank.deposit.loan;

public class InterestCalculation
{
	InterestCalculation()
	{
		System.out.println("i am construtor");
	}
	
	//non static variable
	int interest =5;   //for using default remove public in ob,cls,glb var,cons,method
	String name="kabil";
	
	public static void main(String[] args)
	{
		InterestCalculation ic=new InterestCalculation();
		ic.calculate();
		System.out.println(ic.interest);
		ic.display();
		
		// assume = return 10;  in main method to get output is today task
	}
	void calculate()   //public not use becoz its access only within class
	{
		System.out.println("i am calculate method");
	}
	void display()
	{
		System.out.println("i am display method");
	}
}