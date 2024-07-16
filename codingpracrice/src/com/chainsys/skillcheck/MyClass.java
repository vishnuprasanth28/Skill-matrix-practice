package com.chainsys.skillcheck;

import java.util.Scanner;



public class MyClass {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
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

	            System.out.print("Enter branch: ");
	            String branch = sc.nextLine();

	            System.out.print("Enter rating: ");
	            double rating = sc.nextDouble();
	            
	            System.out.print("are you using transport");
	            boolean companyTransport= sc.nextBoolean();

	            employees[i] = new Employee(id, name, branch,rating,companyTransport );
	        }
	        System.out.println("Enter branch");
	        String branch = sc.next();
	        int countOfEmployees =findCountOfEmployeesUsingCompTransport(employees,branch);
	        System.out.println(countOfEmployees);
	        Employee secondHighest =findEmployeeWithSecondHighestRating(employees);
	        if(secondHighest!=null) {
	        	System.out.println("emp id:"+secondHighest.getEmployeeId());
	        	System.out.println("emp id:"+secondHighest.getName());
	        }else {
	        	System.out.println("no employees using transport");
	        }
	        
	 }
	 
	 
	 public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
         int count = 0;
         for (Employee employee : employees) {
             if (employee.getBranch().equals(branch) && employee.isCompanyTransport()) {
                 count++;
             }
         }
         return count;
     }

     public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
         Employee highest = null;
         Employee secondHighest = null;

         for (Employee employee : employees) {
             if (!employee.isCompanyTransport()) {
                 if (highest == null || employee.getRating() > highest.getRating()) {
                     secondHighest = highest;
                     highest = employee;
                 } else if (secondHighest == null || employee.getRating() > secondHighest.getRating()) {
                     secondHighest = employee;
                 }
             }
         }

         return secondHighest;
     }
}
