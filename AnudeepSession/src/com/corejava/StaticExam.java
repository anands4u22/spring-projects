package com.corejava;


class StaticA
{
	public static  void m1()
	{
		System.out.println("in  class A static method m1 ");
	}
}

public class StaticExam {
	private static int count=0;
	 int nonstatic;
	
	public static  void m1()
	{
		count=10+10;
		
		System.out.println("in static method m1");
		
	}
	static
	{
		System.out.println("In static block");
	}
	{
		System.out.println("In instance block");
	}
	public void m2()
	{
		count=count+10;
		this.nonstatic++;
		System.out.println("In method m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExam s1=new StaticExam();
		StaticExam s2=new StaticExam();
		//StaticExam.m1();
		/*StaticA.m1();
		System.out.println("after m1");
		System.out.println("count"+count);
		System.out.println("nonstatic"+s1.nonstatic);*/
		s1.m2();
		System.out.println("after s1 m2");
		System.out.println("count"+s1.count);
		System.out.println("nonstatic"+s1.nonstatic);
		s2.m2();
		
		System.out.println("after s2 m2");
		System.out.println("count"+s2.count);
		System.out.println("nonstatic"+s2.nonstatic);

	}

}
