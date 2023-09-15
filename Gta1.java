public class Gta1 extends Game	 //extends keyword used to Gta1 class access the Game class
{
public Gta1()  //constructor
{
System.out.println("ITS GTA1");
}
	public static void main(String[] args)  //main method 
	{
		Gta1 g=new Gta1(); //object specific
		g.fight();  //method specific
		g.enjoy();
	}
	public void fight() //method declaration
	{
	this.enjoy();   //this keyword refer to current object of class
	System.out.println("FIGHT");
	}
	public void enjoy()
	{
	super.enjoy(); //super keyword refer to super class of object
	System.out.println("ENJOY GTA1");
	}
}
