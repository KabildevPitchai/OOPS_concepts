public class Table2
{
	
	public static void main(String[] args)
	{
		Table2 time=new Table2();
		int h=time.mul();
		time.mul(h,2);
		time.mul(h,2,2);
		time.mul(h,2,2,2);
		time.mul(h,2,2,2,2);
	}
		
	public int mul()
	{
		int no=2;
		System.out.println("its a table of ="+no);
		return no;
	}
	
	public void mul(int a,int b)
	{
		a=2;
		b=2;
		System.out.println(a*b);
	}
	
	public void mul(int a,int b,int c)
	{
		a=2;
		b=2;
		c=2;
		System.out.println(a+b+c);
	}
	public void mul(int a,int b,int c,int d)
	{
		a=2;
		b=2;
		c=2;
		d=2;
		System.out.println(a+b+c+d);
	}
	
	public void mul(int a,int b,int c,int d,int e)
	{
		a=2;
		b=2;
		c=2;
		d=2;
		e=2;
		System.out.println(a+b+c+d+e);
	}
	
	
}