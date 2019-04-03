package com.cg.eis.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;
/***
 * 
 * @author DOLA SAI RAM
 *
 */
public class EmployeeDAOClass implements EmployeeDAOInterface{
	List<Employee> emp = new ArrayList<Employee>();

	@Override
	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emp.add(e);		
		return "emp added";
	}

	@Override
	public Employee searchEmployee(String str) {
		// TODO Auto-generated method stub
		for(Employee e:emp)
		{
			if(e.getId().equals(str))
			{
				return e;
			}
		}
		return null;
	}
	public List<Employee> displayAllEmployee()
	{
		return emp;
	}
}
