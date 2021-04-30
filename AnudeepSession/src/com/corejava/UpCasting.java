package com.corejava;

class X
{
	void m1()
	{
		System.out.println("m1");
	}
}
class Y extends X
{
	void m2()
	{
		System.out.println("m2");
	}
}
class Z extends Y
{
	
	void m3()
	{
		System.out.println("m3");
	}
}


// X->Y->Z
public class UpCasting {

	public static void main(String[] args) {
	X x=new Z();
	//Z z=new X();
	System.out.println(x instanceof Z);
	if(x instanceof Z)
	{
	Z z=(Z)x;
	
	}


	}

}
