package com.corejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		try{
		 FileReader reader = new FileReader("file.txt");
	      
		    // passing FileReader to
		    // buffered reader
		    BufferedReader br = new BufferedReader(reader);
		      
		    // declaring empty string 
		    String data =null;
		      
		    // while loop to read data 
		    // and printing them
		    while ((data = br.readLine()) != null) 
		    {
		        System.out.println(data);
		    }
		      
		    // closing the object
		   
		}
		catch(FileNotFoundException f)
		{
			System.out.println("filenot found exception occured");
		}
		catch(IOException i)
		{
			System.out.println("IoException found exception occured"+i);
		}
		finally
		{}

	}

}
