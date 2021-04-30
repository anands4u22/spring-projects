package com.corejava;

public class CondtioningExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a2=10;
		if(a2>10)
		{
			System.out.println("in if");
		}
		else
		{
			System.out.println("in else");
		}
		
		switch("hello")
		{
		
		case "hello1":
		{
			System.out.println("In hello");
			break;
		}
		case "hi":
		{
			System.out.println("In hi");
			break;
		}
		default:
		{
			System.out.println("In default");
		}
		}
		//looping for, while, do while
		// we know the limit
		int w=20;
		while(w>0)
		{
			w--;
			break;
		}
		do
		{
			System.out.println("In do");
		} while(w>20);

	}

}
