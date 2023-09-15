public class CollegeLife extends CollegeLife1
{
	String name;
	int year;
	String hobby;
	
	public CollegeLife(String name,int year,String hobby)
	{
		this.name=name;
		this.year=year;
		this.hobby=hobby;
	}
public static void main (String[] args)
{
	CollegeLife life=new CollegeLife("kabil",4,"goodboy");
	//CollegeLife life1=new CollegeLife("vicky",4,"calmboy");
	//CollegeLife life2=new CollegeLife("vallarasu",4,"goodboy");
	life.details();
	//life1.details();
	//life2.details();
	
}
	public void detail()
	{
		System.out.println(name);
		System.out.println(year);
		System.out.println(hobby);
	}
	
	}



