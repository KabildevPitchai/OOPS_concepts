public class Developer implements Abc_Pvt_Ltd   //implements use b/w class & interface
{
public static void main(String[] args)
{
Developer dev=new Developer();
dev.buy();
dev.sell();
System.out.println(dev.value); //method calling using child object
//dev.value=100;  //because  in INTERFACE cant modify,its in default FINAL
System.out.println(Abc_Pvt_Ltd.value);  //method calling of parent class
System.out.println(Developer.value);   //method calling using class name
}
public void staffAttentance()
{
System.out.println("staffAttentance");
}

public void buy()
{
System.out.println("buy");
}

public void sell()
{
System.out.println("sell");
}

public void profit()
{
System.out.println("profit");
}

}
