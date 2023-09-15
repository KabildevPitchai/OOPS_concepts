public class Calculator
{

public static void main(String[] args)
{
	//object creation
 Calculator casio=new Calculator();
	
	int result=casio.add(); //method calling statement
	System.out.println("result is =>"+result);
	
	int secondCall=result;
	System.out.println("secondCall is =>"+secondCall);
}
	public int add()
	{
		System.out.println("hi this is add method");
		int no1=20;
		int no2=30;
		int total=no1+no2;
		return total;
		//System.out.println("hi kabil"); does not compile because after return type no line will be executed.. on 21/05/23
}
}
