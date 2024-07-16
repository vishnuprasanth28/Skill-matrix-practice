package com.chainsys.skillcheck;

public class Manager extends Member {
	
	private String specialization;
	private String department;
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Manager(String name, int age, String contact, String address, double salary, String specialization,
			String department) {
		super(name, age, contact, address, salary);
		this.specialization = specialization;
		this.department = department;
	}
	public Manager() {
		
	}
	@Override
	public String toString() {
		return "Manager [specialization=" + specialization + ", department=" + department + ", name" + getName()
				+ ", age" + getAge() + ", Contact" + getContact() + ", address" + getAddress()
				+ ", Salary" + getSalary() + ", toString()=" + super.toString() + ", Salary"
				+ printSalary() + "]";
	}

	
	
}
