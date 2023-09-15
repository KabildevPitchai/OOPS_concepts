public class Product
{
	String NAME;
	int MRP;
	String MFD;
	String EXPD;
	public Product(String NAME,int MRP,String MFD,String EXPD)
	{
		this.NAME=NAME;
		this.MRP=MRP;
		this.MFD=MFD;
		this.EXPD=EXPD;
	}
	public static void main (String[] args)
	{
		Product details1=new Product("soap",50,"14-5-23","20-8-24");
		details1.display();
	}
	public void display()
	{
		System.out.println(NAME);
		System.out.println(MRP);
		System.out.println(MFD);
		System.out.println(EXPD);
	}
}