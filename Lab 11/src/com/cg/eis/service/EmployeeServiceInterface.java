package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public interface EmployeeServiceInterface {
	public String addEmployee(Employee e);
	public Employee searchEmployee(String id);
	public String insuranceScheme(String name);
	public List<Employee> displayAllEmployee();
}
