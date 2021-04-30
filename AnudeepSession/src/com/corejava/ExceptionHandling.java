package com.corejava;



public class ExceptionHandling {

	public static void main(String[] args) {
		
		try{
		
			int c=1/0;
		}
		catch(RuntimeException e)
		{
			System.out.println("Exception caught");
			throw new ArithmeticException();
		}
		finally{
			System.out.println("in finally");
		}
	}

}
