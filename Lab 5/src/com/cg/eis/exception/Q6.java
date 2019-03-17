
//Exercise 6:  Create an Exception class named as “EmployeeException”
//(User defined Exception) in a package named as “com.cg.eis.exception”
//and throw an exception if salary of an employee is below than 3000.
//Use Exception Handling mechanism to handle exception properly.

package com.cg.eis.exception;

class EmployeeException extends Exception
{
	public void printStackTrace()
	{
		System.out.println("The salary is below 3000 cannot be entered");
	}
}
class Employee
{
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary)  throws EmployeeException {
		if(salary>3000){
			this.salary = salary;
			}
		else {
			throw new EmployeeException();
		}
	}
	public Employee() {
		super();
	}
	public Employee(String name, int salary) throws EmployeeException {
		if(salary>3000){
			this.name = name;
			this.salary = salary;
			}
		else {
			throw new EmployeeException();
		}
				
	}
	
}
public class Q6 {
		public static void main(String args[])
		{
			Employee emp=new Employee();
			emp.setName("sairam");
			try {
				emp.setSalary(1000);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
