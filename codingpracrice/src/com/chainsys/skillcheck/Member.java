package com.chainsys.skillcheck;

public class Member {
	private String name;
	private int age;
	private String contact;
	private String address;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Member(String name, int age, String contact, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.salary = salary;
	}
	public Member() {
		
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", contact=" + contact + ", address=" + address + ", salary="
				+ salary + "]";
	}
	public double printSalary() {
		return salary;
	}
	
}
