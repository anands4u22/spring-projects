package com.corejava;

 class A1{
	 public void m1()
	{
		
	}
}
//final classes cannot be inherited
class B1 extends A1
{
	int b;
	B1()
	{

		this(20);
	}
	
	B1(int a)
	{
		this.b=a;
	}
	public void m1()
	{
		
	}
}
//final methods cannot be overridden
public class FinalEx {
    final int a=20;
    int b;
    
    A1 a1=new B1();
	
	public static void main(String[] args) {
		FinalEx f1=new FinalEx();
	
		
		// TODO Auto-generated method stub

	}

}
