public class Redmi extends Mobile1  //child class
{
public Redmi() //constructor
{
System.out.println("Redmi constructor");
}
public Redmi(int no)  //argument method of constructor handling
{
//super(no); //superof method is inbuild in const so  it will goes to parent class const & get o/p of parent cons first

super(no,20); //superof method only using the 1st line of constructor otherwise it shows error

System.out.println("Redmi one arg constructor");
}
public static void main(String[] args)
{
Redmi red=new Redmi(50); //obj with argument parameters
}
}