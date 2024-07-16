package com.chainsys.skillcheck;

import java.util.Scanner;

public class TestBank {
	public static void main(String[] args) {
		CdBank cdBank = new CdBank();
		AbBank abBank = new AbBank();
		BcBank bcBank = new BcBank();
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the bank you want to check balance :");
	System.out.println("1.AbBank   2.BcBank  3.CdBank");
	int choice = sc.nextInt();
	switch(choice) {
	case 1: System.out.println("Balance is :"+abBank.getBalance());
				break;
	case 2:	System.out.println("Balance is :"+bcBank.getBalance());
				break;
				
	case 3:System.out.println("Balance is :"+cdBank.getBalance());
				break;
		default:
			System.out.println("Invalid selection");
	}
	
	
	
	
	}
}
