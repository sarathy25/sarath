package org.test;

public class Employee extends Company {
	public Employee() {
		super("java");
	System.out.println("child default");
	// TODO Auto-generated constructor stub
	}
Employee(int id){
	System.out.println("id is :"+id);
	System.out.println("12345");
}
public static void main(String[] args) {
	Employee e = new Employee();
	Employee e1 = new Employee(444);
	
}
}
