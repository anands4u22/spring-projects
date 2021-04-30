package com.corejava;

import java.io.FileNotFoundException;


class Sample
{
	public static void ex2() throws CustomException
	{
		
	}
}
public class CustomException extends Exception{
	
	public CustomException(String msg)
	{
		System.out.println(msg);
	}
	
	static void m1() throws FileNotFoundException
	{
		
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		m1();
		try
		{
			throw new CustomException("my exception occurred");
		}
		catch(CustomException e){
		System.out.println("caught");
			
		}
		
	}

}
