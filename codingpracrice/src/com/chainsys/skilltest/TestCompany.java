package com.chainsys.skilltest;

import java.util.Scanner;

public class TestCompany {
	

	  public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	      
	        
	        System.out.print("Enter company name: ");
	        String companyName=sc.next();
	        System.out.print("Enter number of employees: ");
	        int numEmployees = sc.nextInt();
	        
	        Employee[] employees = new Employee[numEmployees];

	        for (int i = 0; i < numEmployees; i++) {
	            System.out.println("Employee " + (i + 1) + ":");

	            System.out.print("Enter id: ");
	            int id = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Enter name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter designation: ");
	            String designation = sc.nextLine();

	            System.out.print("Enter salary: ");
	            double salary = sc.nextDouble();
	            sc.nextLine(); 

	            employees[i] = new Employee(id, name, designation,salary );
	        }

	        Company company = new Company(companyName, employees, numEmployees);

	        System.out.println("Average salary: " + company.getAverageSalary());
	        System.out.println("Max salary: " + company.getMaxSalary());
	        System.out.print("Enter designation to search: ");
	        String designation = sc.nextLine();
	        Employee[] employeesByDesignation = company.getEmployeesByDesignation(designation);

	        System.out.println("Employees with designation: " + designation);
	        for (Employee employee : employeesByDesignation) {
	            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + 
	                               ", Designation: " + employee.getDesignation() + 
	                               ", Salary: " + employee.getSalary());
	        }
	       

	  }
}
