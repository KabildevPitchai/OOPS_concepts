package android;  //package details

public class Samsung //class specific
{
	private int price=20_000;  //non static variable
	private void playstore() //method declaration
	{
		System.out.println("download apps");
	}
	public static void main(String[] args) //main method
	{
		Samsung sam=new Samsung();
		sam.playstore();
		System.out.println(sam.price);
	}
}
