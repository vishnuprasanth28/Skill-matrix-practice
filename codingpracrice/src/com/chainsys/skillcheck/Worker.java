package com.chainsys.skillcheck;

public class Worker extends Member{
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
	public Worker(String name, int age, String contact, String address, double salary, String specialization,
			String department) {
		super(name, age, contact, address, salary);
		this.specialization = specialization;
		this.department = department;
	}
	public Worker() {
		
	}
	@Override
	public String toString() {
		return "Worker [specialization=" + specialization + ", department=" + department + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getContact()=" + getContact() + ", getAddress()=" + getAddress()
				+ ", getSalary()=" + getSalary() + ", toString()=" + super.toString() + ", printSalary()="
				+ printSalary() + "]";
	}
	

}
