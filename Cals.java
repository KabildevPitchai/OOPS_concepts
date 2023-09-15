//METHOD OVERLOADING PROGRAM IN PRACTICE 24/05/23

public class Cals 
{
	public float add()
	{
		System.out.println("This is add method");
		int a=100;
		float c=200.5f;
		System.out.println(a+c);
		return a+c;
	}
	public void add (float k)
	{
		System.out.println("k is="+k);
	}
	public void add (float kk,int val)
	{
		System.out.println("kk/val is ="+kk/val);
	}
	public void add(String name)
	{
		System.out.println("Name is ="+name);
	}
	public void add(float aj,int ab,String name)
	{
		System.out.println("aj/ab is ="+aj/ab);
		System.out.println("IQ name is ="+name);
	}
	public static void main(String[] args)
	{
		Cals java=new Cals();
		float a=java.add();
		java.add(a);
		java.add(a,10);
		java.add("kabildev");
		java.add(a,10,"karthik");
	}
}
