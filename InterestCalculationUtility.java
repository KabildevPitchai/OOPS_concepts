package com.IndianBank.deposit;

public class InterestCalculationUtility
{
	public int interest=5;

	public static void main(String[] args)
	{
		InterestCalculation ic=new InterestCalculation();
		ic.calculate();
		System.out.println(ic.interest);
		ic.display();
	}
	
}