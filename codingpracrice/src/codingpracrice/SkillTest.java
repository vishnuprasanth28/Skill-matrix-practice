package codingpracrice;

import java.util.ArrayList;
import java.util.Scanner;

public class SkillTest {
	public static void main(String[] args) {
		String name;
		String accountNumber;
		String IFSC ="ABCD0123456";
		double existingBalance = 1000;
		double withdrawlAmount;
		ArrayList<String> names= new ArrayList<>();
		if(Validation.validateName("vishnu")) {
			names.add("vishnu");
			}
		if(Validation.validateName("vikram")) {
			names.add("vikram");
			}
		ArrayList<String> accounts = new ArrayList<>();
		if(Validation.validateAccount("123456789012")) {
		accounts.add("123456789012");
		}
		if(Validation.validateAccount("101234567890")) {
			accounts.add("101234567890");
			}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deposit or withdrawl or verify");
		String choice = scanner.next();
		switch (choice.toLowerCase()) {
		case "withdrawl":
			System.out.println("Enter your name");
			name = scanner.next();
			while (!Validation.validateName(name)) {
				System.out.println("Enter your name");
				name = scanner.next();
			}
			
			
			System.out.println("Enter your accountNo");
			accountNumber = scanner.next();
			while (!Validation.validateAccount(accountNumber)) {
				System.out.println("Enter your accountNo");
				accountNumber = scanner.next();
			}
			
			System.out.println("Enter your IFSC");
			String validIFSC = scanner.next();
			while (!Validation.validateIfsc(validIFSC)) {
				System.out.println("Enter your IFSC");
				IFSC = scanner.next();
			}
			if(!accounts.contains(accountNumber) && !names.contains(name) && validIFSC!=IFSC) {
				System.out.println("please enter valid account");
			}
			System.out.println("Enter the amount to withdraw");
			withdrawlAmount = scanner.nextDouble();
			if (withdrawlAmount > 0 && withdrawlAmount < existingBalance) {
				System.out.println("current balance :" + SkillTest.withdrawl(withdrawlAmount, existingBalance));
			} else {
				System.out.println("Please enter valid amount");
			}
			break;
		case "deposit":
			System.out.println("Enter the amount to deposit");
			double depositAmount = scanner.nextDouble();
			if (depositAmount > 0) {
				System.out.println("current balance :" + SkillTest.deposit(depositAmount, existingBalance));
			}
			break;
		case "verify":
			System.out.println("Enter your name");
			name = scanner.next();
			while (!Validation.validateName(name)) {
				System.out.println("Enter your name");
				name = scanner.next();
			}
			
			
			System.out.println("Enter your accountNo");
			accountNumber = scanner.next();
			while (!Validation.validateAccount(accountNumber)) {
				System.out.println("Enter your accountNo");
				accountNumber = scanner.next();
			}
			
			System.out.println("Enter your IFSC");
			String userIFSC = scanner.next();
			while (!Validation.validateIfsc(userIFSC)) {
				System.out.println("Enter your IFSC");
				IFSC = scanner.next();
			}
			if(!accounts.contains(accountNumber) && !names.contains(name) && userIFSC!=IFSC) {
				System.out.println("please enter valid account");
			}
			break;
			
			default :
				System.out.println("thank you");
		}
		
	}

	public static double withdrawl(double amount, double existingBalance) {
	
		return existingBalance - amount;
	}

	public static double deposit(double amount, double existingBalance) {
	
		return existingBalance + amount;
	}
}