package com.chainsys.skillcheck;

public class Test {
	public static void main(String[] args) {
		Worker worker = new Worker("vishnu",27,"9845906345","madurai",20000,"java","Development");
		Manager manager = new Manager("kumar",27,"9845616345","madurai",25000,"java","Development");
		System.out.println("salary of worker: "+worker.printSalary());
		System.out.println("salary of manager: "+manager.printSalary());
		System.out.println("worker data :"+worker.toString());
		System.out.println("worker data :"+manager.toString());
		
}
}
