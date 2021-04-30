package com.corejava;

class A{
	int a=100;
}


public class TestCallByValue  {
	
	int a=100;
	
	public static int sum(int a,int b)
	
	{
		a=10;
	    b=11;
		return a+b;
	}
	
	public static void changeVal(int i,Integer I,TestCallByValue test,String s )
	{
		i=i+1;
		I=I+1;
		test.a=test.a+1;
		s=s.concat("world");
	}
	
	public static void callByRef(TestCallByValue test)
	{
		test.a=200;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		Integer I=10;
		TestCallByValue test=new TestCallByValue();
		String s="Hello";
		
		changeVal(i,I,test,s);
		
		int a=5,b=6;
		
		System.out.println(sum(a,b));
		
		System.out.println("a,b"+a+","+b);
		
		callByRef(test);
	
		
		System.out.println("tese.a"+test.a);
	/*	System.out.println("i value :"+i+"I value:"+I+"test.a value:"+test.a
				+"s value:"+s);*/
	}

}
