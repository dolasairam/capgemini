package com.cg.eis.dao;

import com.cg.eis.bean.Employee;
/***
 * 
 * @author DOLA SAI RAM
 *
 */
public interface EmployeeDAOInterface {

	public String addEmployee(Employee e);
	public Employee searchEmployee(String id);
	
}
