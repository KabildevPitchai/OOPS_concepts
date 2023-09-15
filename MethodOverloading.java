public class MethodOverloading           // class specific
{

	public int add()                    //add method1
	{
	return 10+20;                      // if we use return type dont use the void in this method #
	}	                                         
public static void main(String[] args)
{
	MethodOverloading k=new MethodOverloading();
	int m=k.add();                                //method calling statement
	System.out.println(m);                       
	k.add(m,20);                             //method overloading
}
public void add(int j,int b)            //add method2
{
	System.out.println("j*b ="+j*b);
}
}