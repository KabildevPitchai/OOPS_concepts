//[THIS KEYWORD] IS USING THE CONSTRUCTOR INSIDE ASSUME SOME VALUES

public class Aadhar              //26.05.23 class
{
String name;
int age;
String address;

public Aadhar(String name,int age,String address)
{
this.name=name; //this keyword is denoting the current object.
this.age=age;
this.address=address;
}
public static void main(String[] args)
{
Aadhar person1=new Aadhar("nivi",26,"cuddalore");
person1.display();
Aadhar person2=new Aadhar("kausi",20,"mumbai");	
person2.display();
}
public void display()
{
System.out.println(name);
System.out.println(age);
System.out.println(address);
}
}
