package place.tourism.popular;
import place.tourism.Mumbai;//import is used to address the given data files

public class Pune  //class specific
{
public static void main(String[] args) //main method
{
	Mumbai home1=new Mumbai();  //using same class name but diff obj name to access previous file condition(ex:Mumbai.java)
	
	home1.place("my favourite place"); //method calling statement
}
	//public void place(String a) //method declaration statement
	//{
	//	System.out.println(a);
	//}
}
