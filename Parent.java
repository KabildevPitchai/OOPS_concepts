public class Parent extends Gparent
{
	public Parent()
	{
	System.out.println("parent constructor");
	}
	int balance=10000;
	
	public void gardening()
	{
	System.out.println("gardening");
	}
	public void fixmarriage()
	{
	super.fixmarriage();
	System.out.println("parent opinion");
	}
	public void savings()
	{
	System.out.println("savings method");
	}
	public void takerest()
	{
	System.out.println("Parent Takerest");
	}
	
}
