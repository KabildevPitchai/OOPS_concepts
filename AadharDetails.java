//CONSTRUCTOR INSIDE ASSUMING SOME ARGUMENT VALUES

public class AadharDetails
{
String name;
int age;
String address;
public AadharDetails(String s1,int i,String s2)
{
name=s1;
age=i;
address=s2;
}
public static void main(String[] args)
{
AadharDetails person1=new AadharDetails("asha",18,"chennai");
//person1.name="asha";
//person1.age=18;
//person1.address="chennai";
AadharDetails person2=new AadharDetails("indu",25,"calicut");
//person2.name="indu";
//person2.age=25;
//person2.address="calicut";	
AadharDetails person3=new AadharDetails("nivi",28,"perambalur");
//person3.name="nivi";
//person3.age=28;
//person3.address="perambalur";
	person1.display();
	person2.display();
	person3.display();
}
public void display()
{
System.out.println(name);
System.out.println(age);
System.out.println(address);	
}
}