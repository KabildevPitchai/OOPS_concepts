//CONSTRUCTOR OVERLOADING MY NEW CREATION ON29/0

public class Happy 
{
	String name;
	int age;
	String place;
	
	public Happy(String a)
	{
		name=a;
	}
		public Happy(String a,int b)
	{
		name=a;
		age=b;
	}
		public Happy(String a,int b,String c)
	{
		name=a;
		age=b;
		place=c;
	}
	
	public static void main(String[] args)
	{
		Happy feel=new Happy("kabil");
		Happy feel1=new Happy("kabil",23);
		Happy feel2=new Happy("kabil",23,"goa");
		
		feel.display();
		feel1.display1();
		feel2.display2();
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println();
	}
	
	public void display1()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println();
	}
	public void display2()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(place);
		System.out.println();
	}
}
