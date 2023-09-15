//MULTILEVEL INHERITANCE ONE CLASS ACCESS BOTH BASE CLASS AND SUB CLASS

public class Dad extends Mom  //extends keyword used to Dad class access the Mom class 
{
public Dad() //constructor specific
{
System.out.println("Dad constructor");
}
public static void main(String[] args)
{
Dad d=new Dad(); //object specific
d.acts();   //method calling statements of line 10 to 13
d.rules();
d.display();
d.agree();
}
public void acts() //method declaration
{
System.out.println("Playing");
}
}
