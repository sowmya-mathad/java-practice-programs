package com.sow.general;

interface D
{
	void draw();
	static int cube(int n)
	{
		return(n*n*n);
	}
}
 class Drawable implements D
{
	public void draw()
	{
		System.out.println("Drawing ");
	}
}
public class TestInterfaceStatic {
	public static void main(String args[])
	{
		Drawable objDrawable = new Drawable();
		objDrawable.draw();
		System.out.println(D.cube(3));
	}

}
