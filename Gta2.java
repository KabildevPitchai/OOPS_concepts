public class Gta2 extends Game  //extends keyword used to Gta2 class access the Game class
{
public Gta2() //constructor
{
System.out.println("ITS GTA2");
}
	public  static void main(String[] args) //main method 
	{
		Gta2 h=new Gta2(); //object specific
		h.cheat(); //method specific
		h.enjoy();
	}
	public void cheat()  //method declaration
	{
	this.enjoy();
	System.out.println("CHEAT"); //this keyword refer to current object of class
	}
	public void enjoy()
	{
	super.enjoy();  //super keyword refer to super class of objects
	System.out.println("ENJOY GTA2");
	}
}