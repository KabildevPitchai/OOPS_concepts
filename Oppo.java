package android;

public class Oppo extends Samsung
{
private int no=10;
public static void main(String[] args)
{
Oppo oppo=new Oppo();
oppo.playstore(); //method calling
System.out.println(oppo.price);//non static variable output
System.out.println(oppo.no);
}
private void playstore()
{
System.out.println("Access all apps");
}
}