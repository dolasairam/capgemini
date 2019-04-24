package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceClass;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServiceClass esc = new EmployeeServiceClass();
		Employee e;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1.Add an employee");
			System.out.println("2.Search an Employee");
			System.out.println("3.Insurance scheme for an employee");
			System.out.println("4.To display all the Employees");
			temp=sc.nextInt();
			e= new Employee();
			if(temp==1) {
				System.out.println("Enter the Employee Name:");
				String name=sc.next();
				e.setName(name);
				System.out.println("Enter the Employee Designation");
				String designation = sc.next();
				e.setDesignation(designation);
//				System.out.println("Enter the Employee Id");
//				String id = sc.next();
//				e.setId(id);
				System.out.println("Enter the Salary of employee");
				Long salary=sc.nextLong();
				e.setSalary(salary);
				esc.addEmployee(e);
			}
			else if(temp==2) {
				System.out.println("Enter the Id of the Employee");
				String id=sc.next();
				System.out.println(esc.searchEmployee(id));
			}
			else if(temp==3) {
				System.out.println("Enter the Employee Id");
				String id=sc.next();
				System.out.println("The insurance schema is "+esc.insuranceScheme(id));
			}
			else if(temp==4)
			{
				System.out.println(esc.displayAllEmployee());
			}
			else
			{
				temp=5;
			}
			
		}while(temp<=4);

	}

}
