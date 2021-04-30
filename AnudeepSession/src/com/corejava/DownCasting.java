package com.corejava;

 class Abs
{
	 void print()
	{
		System.out.println("In A's print");
	}
}

class DownA extends Abs
{
	void print()
	{
		System.out.println("In DownA");
	}
	void m1()
	{
		System.out.println("In m1");
	}
}

class DownB extends Abs
{
	void print()
	{
		System.out.println("In DownB");
	}
	
	void m2()
	{
		System.out.println("In m2");
	}
}


public class DownCasting {
	
	

	public static void main(String[] args) {
		Abs obj=new DownA();
		if (obj instanceof DownB)
		{
			DownB b=(DownB)obj;
			b.m2();
		}
		else if(obj instanceof DownA)
		{
			DownA a=(DownA)obj;
			a.m1();
		}
		
		
	}

}
