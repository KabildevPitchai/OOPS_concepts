public class Hi
{
	private String name;         //ALL 4 ACCESS MODIFIERS ARE ACCESABLE IN GETTER & SETTER METHOD
	private int model_name;
	
	//protected String name;
	//protected int model_name;
	
	//String name;
	//int model_name;
	
	//public String name;
	//public int model_name;
	
	
	
	public String getName()  //getter
	{
		return this.name;
	}
	
	public void setName(String name) //setter 
	{
		this.name=name;
	}
		
	public int getModel_name()  //getter
	{
		return this.model_name;
	}
	public void setModel_name(int model_name) //setter
	{
		this.model_name=model_name;
	}
}