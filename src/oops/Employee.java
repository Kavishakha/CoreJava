package oops;

public class Employee {
	
	public String Name;
	public int EmpID;
	public String Department;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(String P1, int P2, String P3 ) {
		Name = P1;
		EmpID = P2;
		Department = P3;		
	}
	public void Display () {
		System.out.println(Name);
		System.out.println(EmpID);
		System.out.println(Department);
	}
}
