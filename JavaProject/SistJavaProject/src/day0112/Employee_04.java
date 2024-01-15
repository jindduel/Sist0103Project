package day0112;

public class Employee_04 {
	String empName;
	int salary;
	
	//생성자
	public Employee_04(String name, int sal) {
		this.empName = name;
		this.salary = sal;
	}
	
	//메소드
	public String getEmployee() {
		return empName + ", " + salary;
	}
	
}
