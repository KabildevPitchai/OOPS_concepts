public class Cl implements Ch
{
public static void main(String [] args)
{
Cl c=new Cl();
c.park();
c.beach();
//c.a=100;  
//cant change it becoz its in interface so it have Final value

System.out.println(c.a); 
//variable o/p using child object name
System.out.println(Cl.a);  
//variable o/p using child class name
System.out.println(Ch.a); 
//variable o/p using parent class name
}

public void park()
{
System.out.println("Park");
}


public void beach()
{
System.out.println("Beach");
}

}

The INTERFACE HAVE 3 THINGS  MUST TO KNOW....

1."PUBLIC ABSTRACT" no need to use becoz its predefine in INTERFACE
2."ONCE VALUE ASSIGN IN INTERFACE CANT MODIFY IT IN ANOTHER CLASS "becoz its predefine in INTERFACE
3."WE CANT CREATE OBJECT FOR INTERFACE"
4."CANT USE CONSTRUCTOR"in INTERFACE