package com.Operations;

public class EmployeeDetails {
	protected String emp_name;
	protected int emp_id;
	protected double emp_salary;
	protected String emp_department;
	protected int emp_age;
	protected String emp_address;
	protected String emp_gender;
	protected String emp_skills;

	public EmployeeDetails(String emp_name, int emp_id, double emp_salary, String emp_department, int emp_age,
			String emp_address, String emp_gender, String emp_skills) {

		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
		this.emp_department = emp_department;
		this.emp_age = emp_age;
		this.emp_address = emp_address;
		this.emp_gender = emp_gender;
		this.emp_skills = emp_skills;
	}

}
