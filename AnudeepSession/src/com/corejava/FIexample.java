package com.corejava;

@FunctionalInterface
interface I
{
	public void m1();
}



public class FIexample {

	public static void main(String[] args) {
		I i1=()->
		{
			System.out.println("hello");
		};
		

	}

}
