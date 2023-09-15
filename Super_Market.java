public class Super_Market
{
//class specific 
	
static String name="More";
static int no = 5; 
	
//object/instance specific
String product_name;
int price;
	
public static void main(String[] args)
{
 
System.out.println(Super_Market.name); 
System.out.println(name); 
 
Super_Market product1 = new Super_Market();
System.out.println(product1.name);
 
product1.product_name="biscut";
product1.price=30; 
Super_Market product2 = new Super_Market(); 
product2.product_name="milk";
product2.price=40; 
 
System.out.println(product1.product_name); 
System.out.println(product2.price);
}
}