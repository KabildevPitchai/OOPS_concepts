public class Load1
{
	public static void main(String[] args)                    //24/05/23 program
	{
		Load1 king=new Load1();
		int k=king.add();
		System.out.println(k);
		int h=king.add(k,2);
		System.out.println(h);
		king.add(20.2f);
		king.add(20.2f,20,"kabildev");
	}
	
	public int  add()
	{
		return 10+10;
	}
	
	public int add(int d,int r)
	{
		System.out.println("d*r is ="+d*r);
		return d*r;
	}
	
	public void add1(int d,int t)
	{
		System.out.println("d*t ="+d*t);
	}
	
	public void add(float a)
	{
	System.out.println("a is="+a/2);
	}
	
	public void add (String a1)
	{
		System.out.println("a1 is ="+a1);
	}
	
	public void add(float b,int c,String a)
	{
		System.out.println("b/c is ="+b/c);
		System.out.println("Name is ="+a);
	}
}