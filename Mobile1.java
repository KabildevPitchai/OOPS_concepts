public class Mobile1  //parent class
{
	public Mobile1()
	{
		this(50); //thisof method used to redirect to given argument of constructor 
		
		//this (50) goes to line 12
		
		//Mobile mob=new Mobile();
		
		System.out.println("mobile-constructor");
	}
	public Mobile1(int no)
	{
		System.out.println("mobile one arg constructor");
	}
	public Mobile1(int no1,int no2)
	{
		System.out.println("mobile two arg constructor");
	}
}