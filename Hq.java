public class Hq
{
	public static void main(String[] args)
	{
		Hi hq=new Hi();  //without use extends so we use parent class object in child class to access parent methods
		hq.setName("KABILDEV"); //directly calling the [setmethod with parameters] from Hi class
		System.out.println(hq.getName());
		
		Hi q=new Hi();
		q.setModel_name(15324);
		System.out.println(q.getModel_name());
	}
}