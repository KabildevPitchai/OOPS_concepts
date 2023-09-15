package com.cricket;

public class College
{
	String name;
	int age;
	String location;
	int num;
	
	public College(String name,int age,String location)
	{
		this.name=name;
		this.age=age;
		this.location=location;
	}
	public College(int num)
	{
	this.num=num;
	}
	
	public static void main(String[] args)
	{
		College person=new College("subu",22,"trichy");
		College person1=new College("sneka",22,"Erode");
		College person2=new College("kabil",23,"chennai");
		person.details();
		person1.details();
		person2.details();
		
		College person3=new College(10);
		person3.details1();
	}
	public void details()
	{
		System.out.println("name is =>"+name);
		System.out.println("age is =>"+age);
		System.out.println("location is =>"+location);
		System.out.println();
	}
	public void details1()
	{
		System.out.println("Number is =>"+num);
	}
	
}

