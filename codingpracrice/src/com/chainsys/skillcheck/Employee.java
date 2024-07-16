package com.chainsys.skillcheck;

public class Employee {
	private int employeeId;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", branch=" + branch + ", rating=" + rating
				+ ", companyTransport=" + companyTransport + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.companyTransport = companyTransport;
	}
	public Employee() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isCompanyTransport() {
		return companyTransport;
	}
	public void setCompanyTransport(boolean companyTransport) {
		this.companyTransport = companyTransport;
	}
	private String name;
	private String branch;
	private double rating;
	boolean companyTransport;
	
	
}
