package place.tourism; //its create a folder of given class

public class Mumbai  //class specific
{
	public static void main(String[] args) //main method
{
	Mumbai home=new Mumbai(); //obj specific
	home.place("im a tourist place");//method calling statement
}
public void place(String a) //method declaration
{
	System.out.println("my output is =>"+a);
}
	
}