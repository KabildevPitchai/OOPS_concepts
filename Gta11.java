public class Gta11 extends Gta1
{

public Gta11()
{
System.out.println("ITS A GTA11");
}
public static void main(String [] args)
{
Gta11 g1=new Gta11();
g1.enjoy();
g1.task();
g1.fight();
int c=g1.chl();
System.out.println(c);
g1.chl(c);
}

public int chl()
{
int no1=10;
int no2=10;
int total=no1+no2;
return total;
}
public void chl(int b)
{
System.out.println("c is ="+b);
}
public void enjoy()
{
System.out.println("GTA11 ENJOY");
}

public void task()
{
System.out.println("TASK");
}

}
	