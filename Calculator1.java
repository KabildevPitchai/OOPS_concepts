public class Calculator1
{
// Class specific
	
public static void main(String[] args)    
{
	//object creation
	
 Calculator1 casio=new Calculator1();
	
	// primitive datav types
	
	int Answer=casio.add(); //method calling statement
    //byte Answer1=casio.sub();                             
	//short Answer2=casio.div();
	long Answer3=casio.multi();
	float Answer4=casio.multi1();
	double Answer5=casio.add1();
	boolean Answer6=casio.condition();
	char Answer7=casio.name();
	String Answer8=casio.word();
	
	System.out.println("result is ="+Answer);
	//System.out.println("result is ="+Answer1); 
	//System.out.println("result is ="+Answer2);  
	System.out.println("result is ="+Answer3);
	System.out.println("result is ="+Answer4);
	System.out.println("result is ="+Answer5);
	System.out.println("result is ="+Answer6);
	System.out.println("result is ="+Answer7);
	System.out.println("result is ="+Answer8);
}
	
	public int add()
	{
		int no1=20;
		int no2=30;
		int total=no1+no2;
		return total;
	}
	
    public byte sub()
	{
		 byte no3=20;                                
		 byte no4=30;
		 byte total1=no3-no4;
		return total1;
	}
	
	public short div()
	{
	//	short no5=300;
	//	short no6=30;
	//	short total2=no5/no6;
	//	return total2;
	//}
	
	public long multi()
	{
		long no7=2l;
		long no8=3l;
		long total3=no7*no8;
		return total3;
	}
	
	public float multi1()
	{
	float no9=2.5f;
	float no10=2.5f;
	float total4=no9+no10;
		return total4;
	}
	
		public double add1()
	{
	double no11=2.5;
	double no12=10.5;
	double total5=no11+no12;
		return total5;
	}
	
		public boolean condition()
	{
		return false;
	}

	public char name()
	{
		char name='k';
		return name;
}
	//Non primitive data types
	
	 public String word()
 {
	 String name1="karthik";
	 return name1;
}
	// = it means system cant read this symbol line 
   //byte & short datatype cant do the arithematical operations in this program so i just put unread code(//) to both .
 //remains will be executed and got output .....
}