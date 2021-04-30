package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFirst {

	public static void main(String[] args) {
		
		
		Set<Student> studentSet=new HashSet();
		
		studentSet.add(new Student(2,"bob",400000));
		studentSet.add(new Student(3,"chris",300000));
		studentSet.add(new Student(1,"anudeep",200000));
		studentSet.add(new Student(1,"anudeep",200000));
	
		
		System.out.println(studentSet);
		
		
		
		
		
	}

}
