package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	
	// List, ArrayList, LinkedList
	// Map , HashMap, LinkedHasMap
	//Set HashSet
	//Queue

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList=new ArrayList<>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		
	  for(int i=0; i<aList.size();i++)
	  {
		  System.out.println(aList.get(i));
	  }
	}

}
