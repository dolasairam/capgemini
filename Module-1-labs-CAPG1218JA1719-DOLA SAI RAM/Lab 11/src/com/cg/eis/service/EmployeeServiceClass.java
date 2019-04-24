package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAOClass;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class EmployeeServiceClass implements EmployeeServiceInterface {
	
	EmployeeDAOClass dao =new EmployeeDAOClass();
	static int i=1;
	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		String str=""+i;
		e.setId(str);
		if(e.getName().length()>4)
		{
			if(e.getDesignation().equals("System Associate") && e.getSalary()>5000 
					&& e.getSalary()<20000)
			{
				e.setInsuranceScheme("Scheme C");
			}
			else if(e.getDesignation().equals("Programmer") && e.getSalary()>=20000
					&& e.getSalary()<40000)
			{
				e.setInsuranceScheme("Scheme B");
			}
			else if(e.getDesignation().equals("Manager") && e.getSalary()>=40000)
			{
				e.setInsuranceScheme("Scheme A");
			}
			else if(e.getDesignation().equals("Clerk") && e.getSalary()<5000) {
				e.setInsuranceScheme("No Scheme");
			}
			else
			{
				return "Invalid";
			}
			System.out.println(dao.addEmployee(e));
			i=i+1;
			return "Added Employee";
		}
		else
		{
			return "Invalid";
		}
	}

	@Override
	public Employee searchEmployee(String id) {
		// TODO Auto-generated method stub
		Employee e=dao.searchEmployee(id);
		if(e==null)
			return null;
		else
			return e;
	}

	@Override
	public String insuranceScheme(String id) {
		
		// TODO Auto-generated method stub
		Employee e=dao.searchEmployee(id);
		if(e.getDesignation().equals("System Associate") && e.getSalary()>5000 
				&& e.getSalary()<20000)
		{
			return e.getInsuranceScheme();
		}
		else if(e.getDesignation().equals("Programmer") && e.getSalary()>=20000
				&& e.getSalary()<40000)
		{
			return e.getInsuranceScheme();
		}
		else if(e.getDesignation().equals("Manager") && e.getSalary()>=40000)
		{
			return e.getInsuranceScheme();
		}
		else if(e.getDesignation().equals("Clerk") && e.getSalary()<5000) {
			return e.getInsuranceScheme();
		}
		else
		{
			return "Invalid";
		}
	}

	
	public List<Employee> displayAllEmployee() {
		// TODO Auto-generated method stub
			List<Employee> li=dao.displayAllEmployee();
			return li;
	}
	

}
