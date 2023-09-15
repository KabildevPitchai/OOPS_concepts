public class Food implements Swiggy,Zomato
{
public static void main(String [] args)
{
Food fo=new Food();  //Static binding or early binding
Zomato zz=new Food(); //dynamic binding or late binding {Zomato class methods only accessed & can't access Swiggy class&Food class methods}
Swiggy sw=new Food(); //dynamic binding or late binding {Swiggy class methods only accessed & can't access Zomato class&Food class methods}
sw.sell(); 
//sw.map(); its a Zomato class in method so cant access by Swiggy object

fo.buy(); //{ its totally Food class object with method calling
fo.sell();
fo.map();
fo.dis();
fo.mob(); //}

zz.map();//{its totally Zomato class object with method calling
zz.dis();//}
//zz.sell(); //its a Swiggy class method so cant access by Zomato object

}
public void buy()
{
System.out.println("BUY");
}
public void sell()
{
System.out.println("SELL");
}
public void map()
{
System.out.println("MAP");
}
public void dis()
{
System.out.println("DIS");
}
public void mob()
{
System.out.println("MOB");
}

}