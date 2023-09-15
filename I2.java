public interface I2 extends I1
{
	public static void main(String [] args)
	{
		I1 o=new I2();
		o.buy();
		o.get();
		//i.met();
	}
	public void buy()
	{
		System.out.println("BUY");
	}
	public void get()
	{
		System.out.println("GET");
	}
	public void met()
	{
		System.out.println("MET");
	}

}