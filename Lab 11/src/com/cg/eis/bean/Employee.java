package com.cg.eis.bean;
//In this package, create “Employee” class with different attributes
//such as id, name, salary, designation, insuranceScheme.

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class Employee {
	private String name;
	private String id;
	private Long salary;
	private String designation;
	private String insuranceScheme;
	public Employee() {
		super();
	}
	public Employee(String name, String id, Long salary, String designation, String insuranceScheme) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]\n";
	}
}
