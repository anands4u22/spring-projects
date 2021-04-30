package com.corejava;



public final class ImmutableExam {
	
	private final int id;
	private final String name;
	private final int age;
	
	public ImmutableExam(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		s1.setId(2);
		s1.setName("Anudeep");
		s1.setAge(27);

		
		System.out.println(s1);
		
		s1.setAge(30);
		
		System.out.println(s1);
	}

}
