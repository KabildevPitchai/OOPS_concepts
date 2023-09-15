public class Calculator2                                   //23/05/2023 notes
{
	public float add()    //method definition
	{
	System.out.println("I am add method");
		
		//int no1=10;
		//float no2=10.5f;
		//float total=no1+no2;
		
		return 10+30.5f; //40.5
	}
	
	public void divide(float k)   //arguments
	{
		System.out.println("k is ="+k);
	}
	
	public void divide(float ar,int no) 
	{
		System.out.println("ar is no==>"+ar);
	}
	
	public void divide(String kk)
	{
		System.out.println("kk is no==>"+kk);
	}
	
	public static void main(String[] args)
	{
		Calculator2 casio=new Calculator2();
		float fl=casio.add();
		System.out.println(fl);  // method calling statement
		//casio.divide(casio.add()); //or
		casio.divide(fl);
		casio.divide(fl,2);
		casio.divide("kabildev");	
	}
		
}