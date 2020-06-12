package com.sow.general;

/**
 * 
 * @author Sowmya
 *
 */
interface A
{
	void a();
	void b();
	void c();
}

abstract class B implements A
{
	void d()
	{
		System.out.println("In absrtract class method");
	}
}
 class M extends B
{
	@Override
	public void a() {
		System.out.println("In method a");		
	}

	@Override
	public void b() {
		System.out.println("In method b");		
	}

	@Override
	public void c() {
		System.out.println("In method c");		
	}
}
public class Test1 {

		public static void main(String[] args)
		{
			M obj =  new M();
			obj.d();
			obj.a();
		}
}
