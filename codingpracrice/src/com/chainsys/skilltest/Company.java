package com.chainsys.skilltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {

    private String companyName;
    private Employee[] employees;
    private int numEmployees;
    
    public Company(String companyName, Employee[] employees, int numEmployees) {
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public String toString() {
        return "Company [companyName=" + companyName + ", employees=" + Arrays.toString(employees)
                + ", numEmployees=" + numEmployees + "]";
    }

    public Company() {
        
    }
    
    
    //methods in the company class 
    
    public double getAverageSalary() {
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary = totalSalary + emp.getSalary();
        }
        return totalSalary / numEmployees;
    }
    
     public double getMaxSalary() {
            double maxSalary = employees[0].getSalary();
            for (int i = 1; i < numEmployees; i++) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                }
            }
            return maxSalary;
        }
     
     
     public Employee[] getEmployeesByDesignation(String designation) {
            ArrayList<Employee> employeesByDesignation = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getDesignation().equalsIgnoreCase(designation)) {
                    employeesByDesignation.add(employee);
                }
            }
            return employeesByDesignation.toArray(new Employee[0]);
        }
    
     
}

