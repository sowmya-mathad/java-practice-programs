package com.sow.general;

class Student1 implements Cloneable
{
	String name;
	int id;
	
	Student1(String str, int id)
	{
		this.name = str;
		this.id = id;
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}
}
public class TestClonable {
	public static void main(String[] args)
	{
		Student1 s1 =  new Student1("AAA", 111);
		Student1 s2 = null;
		try {
			 s2 = (Student1) s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);

	}
}

