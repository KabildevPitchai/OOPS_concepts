public class Mobile  //class specific  //25/05/23 blog
{
	//object specific 

	String name;
	int age;
	String location;
	long num;
	int birthyear;
	
	public Mobile(String a,int b,String c,long d,int e) //constructor specify the object values
	{
		name=a;
		age=b;
		location=c;
		num=d;
		birthyear=e; 
	}
	
		public Mobile(String a,int b,String c,long d)
	{
		name=a;
		age=b;
		location=c;
		num=d;
	}
	
		public Mobile(String a,int b,String c)
	{
		name=a;
		age=b;
		location=c;
	}
	
		public Mobile(String a,int b)
	{
		name=a;
		age=b;
	}
	
		public Mobile(String a)
	{
		name=a;
	}
	
	public static void main(String[] args)
	{
		Mobile memory=new Mobile("kabil",25,"chennai",1222572430,1997);
		Mobile memory1=new Mobile("subu",23,"velacherry",1238248471);
		Mobile memory2=new Mobile("ram",23,"guindy");
		Mobile memory3=new Mobile("jaya",23);
		Mobile memory4=new Mobile("sneka");
		memory.details();  //method calling statements 45 to 49
		memory1.details1();
		memory2.details2();
		memory3.details3();
		memory4.details4();
	}
	
	public void details()       //method defining statements 51 to 86
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(location);
		System.out.println(num);
		System.out.println(birthyear);
		System.out.println();
	}

	public void details1()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(location);
		System.out.println(num);
		System.out.println();
	}
	
	public void details2()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(location);
		System.out.println();
		
	}
	
	public void details3()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println();
	}
	
	public void details4()
	{
		System.out.println(name);
		System.out.println();
	}
}