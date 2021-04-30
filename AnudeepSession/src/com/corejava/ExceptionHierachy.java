package com.corejava;

import java.io.FileNotFoundException;
import java.io.IOException;

class AEx{
	 void m1() throws FileNotFoundException
	 {
		 
	 }
}
class BEx extends AEx
{
	void m1() throws RuntimeException
	{
		
	}
}

public class ExceptionHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
