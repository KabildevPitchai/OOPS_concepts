public class Super_Market3
{
  static String product_name;
  int price;
  public static void main(String[] args)
  {
    Super_Market3 product=new Super_Market3();
    product.product_name="apple";
    product.price=200;
    System.out.println(product.product_name);
    System.out.println(product.price);
    
    Super_Market3 product1=new Super_Market3();
    product1.product_name="orange";
    product1.price=400;
    
    
    System.out.println(product1.product_name);
    System.out.println(product1.price);    
  }
}
