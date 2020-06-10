package com.sow.java8Featr;

@FunctionalInterface
interface Messagable{  
    public void msg(String name);  
}  
public class LamdaExpressionEx5 {
	public static void main(String args[])
	{
		Sayable s1 = (name) -> { return "Hello " + name;};
		System.out.println(s1.say("Sowmya"));
		
		Sayable s2 = name -> { return "Hello " + name;};
		System.out.println(s2.say("Sowmya"));
	}

}
