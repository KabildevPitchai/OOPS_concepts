public  class Children extends Parents
{
	public static void main(String [] args)
	{
		Children ch=new Children();  
		ch.study();        //also all method cannot accessable
		ch.motivate();
		ch.workhard();
		ch.play();
	}
	public void study() //parent class override
	{
	System.out.println("children-study");
	}
	public void play()
	{
	System.out.println("playing Hockey");
	}
}