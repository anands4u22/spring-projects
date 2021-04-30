package com.corejava;

import java.util.Comparator;

public class Student {
	private int id;
	private String name;
	private long salary;
	
	public Student(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object s)
	{
		if(this==s) return true;
		if(s==null) return false;
		
		Student temp=(Student)s;
		
		if(this.id== temp.id) return true;
		
		if(this.name.equals(temp.name)) return true;
		
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
	}

}

class NameComparator implements Comparator<Student>
{
	public int compare(Student s, Student s1){
		
		return s.getName().compareTo(s1.getName());
	}
}
