package treesbank;

import java.util.Scanner;


public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			BankAccount obj1 = new BankAccount("XYZ", "BA001");
			obj1.showMenu();
	}

}

class BankAccount {

	// operations that will happen on bank account such as withdraw, see previous
	// balance, and more..

	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	// pass these two values while displaying welcome message to the user.
	// add a constructor , same name as class but with no return type.
	// values for Customer name and Id will be needed for displaying the message to
	// the user
	BankAccount(String cname, String cid) {

		customerId = cid;
		customerName = cname;
	}

	// amount as parameter because you are depositing an amount
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;

		}
	}

//implement balance with amount.. with previous transaction, needs to know the amount.
	// - symbolizes withdrawal
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	// this method will return a message to tell if you deposited an amount, or
	// withdrew an amount.
	// if greater than 0, then deposited will run
	// if it is negative or lower than 0, but used absolute to take any value and
	// make it a positive value. Would not make since if it said -1000 for
	// depositing.

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdraw: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred");
		}
	}

	void showMenu() {
		
		//initialize the character with the value
		char option='\0';
		
		//to take user input from the console
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is "+customerId);
		//it will display a space of line to make application look good
		System.out.println("\n");

		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit ");

		
		do 
		{
			System.out.println("****************************************************");
			System.out.println("Enter an option");
			System.out.println("************************************************");
			
			//user will enter a character and it will be caught in the action variable.
			option = sc.next().charAt(0);
			
			System.out.println("\n");
		
			switch(option) {
			
			
			//when user selects option A, they will see their balance.
			case 'A' :
				System.out.println("****************************");
				System.out.println("Balance = "+balance);
				System.out.println("****************************");
				System.out.println("\n");
				break;
				
			case 'B' :
				System.out.println("****************************");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("****************************");
				
				//Scanner object will take the input
				int amount = sc.nextInt();
				deposit(amount);
				
				System.out.println("\n");
				break;
				
			case 'C' :
				System.out.println("****************************");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("****************************");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D' :
				System.out.println("****************************");
				getPreviousTransaction();				
				System.out.println("****************************");
				System.out.println("\n");
				break;
				
			case 'E' :
				System.out.println("************");
				break;
			
				
				//if enter a character like F, it will display nothing
				default:
					System.out.println("Invalid OPtion!!!. please enter again..");
					break;
			}
		}
			while (option != 'E');
			
System.out.println("Thank you for using Tree services!");
				
	}
	}