package com.cricket.local;

import com.cricket.College;

public class College1
{
	String name;
	int age;
	String location;
	
	public College1(String a,int b,String c)
	{
		name=a;
		age=b;
		location=c;
	}
	
	public static void main(String[] args)
	{
		College person=new College("pradeepa",23,"chennai");
		person.details();
	}
		//public void details()
		//{
		//	
		//}
}