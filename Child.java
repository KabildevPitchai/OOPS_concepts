public  class Child extends Parent   // "extends" keyword use to relative of both classes
{
	public Child()      //constructor
	{
		//super();   //its a superof method its used to access first parent cons then second it acccess child cons
		
		System.out.println("child constructor");
	}
	public static void main(String[] args) //an object of one class act as an object of another class
	{
		Child ch=new Child();              //child access any files in parent file because of "extends".
		ch.study();
		//ch.gardening();
		ch.fixmarriage();
		//ch.savings();      
		//System.out.println(ch.balance);
		//ch.takerest();
		//ch.worldtour();
		//Parent pa=new Parent();
		//pa.study(); //parent obj only it accessing... not in child obj
		
		//Parent pa=new Parent();
		//pa.fixmarriage();
	}
	public void study()
	{
		this.fixmarriage(); //blog content
		//ch.fixmarriage(); //cant use child obj(ch)directly in out of main method,becoz ch name knows only main method
		
	System.out.println("studying");
	}
	public void fixmarriage()
	{
		super.fixmarriage();
		System.out.println("child opinion");
	}
}