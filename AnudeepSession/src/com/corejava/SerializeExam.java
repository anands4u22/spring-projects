package com.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class S implements Serializable
{
/**
	 * 
	 */
	private static final long serialVersionUID = -357536292731484283L;
int a;
String b;
static int c;
transient int d;

public S(int a , String b)
{
	this.a=a;
	this.b=b;
}
}

public class SerializeExam {
	
	

	public static void main(String[] args) throws Exception  {
	
		
		S s=new S(1,"hello");
		FileOutputStream filOut=new FileOutputStream("E:\\output.txt");
		ObjectOutputStream out=new ObjectOutputStream(filOut);
		out.writeObject(s);
		s.a=20;
		s.c=30;
		FileInputStream fileIn=new FileInputStream("E:\\output.txt");
		ObjectInputStream in=new ObjectInputStream(fileIn);
		s=(S)in.readObject();
		
		System.out.println(s.a);
		System.out.println(s.c);
		
		
	
	}

}
