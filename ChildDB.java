public class ChildDB extends ParentDB  //because ParentDB using FINAL keyword so ParentDB cant inherit.
	
{  
	final int val=20_000; //final keyword cant change it & its fixed one 
	public static void main(String[] args)
	{
		ChildDB ch=new ChildDB();  // its called "EARLY BINDING /STATIC BINDING "
		ParentDB ch2=new ChildDB();   //Its called "LATE BINDING / DYNAMIC BINDING" ALSO  Method overriding is must
		ch2.cook();   //both
		ch2.hobbies();//both
		ch2.advice(); //only in parent
		//ch2.code();  //only in Child
	}
	public final void cook() //parent class override
	{
	//val=20_100;  //if val is using FINAL keyword val cant change if change means it give error
	
	System.out.println(val);
	System.out.println("Child cook");
	}
	public void hobbies() //parent class Override
	{
	System.out.println("Child hobbies");
	}
	public void WorkFromHome()
	{
	System.out.println("Work from home");
	}
	public void code()
	{
	System.out.println("Code");
	}
	public void meeting()
	{
	System.out.println("Meeting");
	}
}


/*USING FINAL KEYWORD 
1.USING FINAL IN CLASS CANT INHERIT B/W TWO CLASSES
2.USING FINAL IN VARIABLE WE CANT CHANGE VALUE
3.USING FINAL IN PARENT CLASS WE CANT OVERRIDING A METHOD */








