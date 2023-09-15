public class Super_Market1
{
	//class specific
	static String name="phoneix";
	static int no=55;
	//object specific
	String product_name1;
	int price1;
	String product_name2;
	int price2;
	public static void main(String[] args)
	{
			//object creating
	Super_Market1 product1=new Super_Market1();
	System.out.println(product1.product_name1);
	System.out.println(product1.price1);
	Super_Market1 product2=new Super_Market1(); 
	System.out.println(product2.product_name2);
	System.out.println(product2.price2);
	System.out.println(Super_Market1.name);
	System.out.println(Super_Market1.no);
	}
}