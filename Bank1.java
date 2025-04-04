import java.util.*;
public class Bank {
	private static int accountcounter=1001;
	private String name , address;
	private int acc_no;
	private double balance;
	public Bank(String name,String address,double balance) {
		this.name=name;
		this.address=address;
		this.balance=balance;
		this.acc_no=accountcounter++;
	}
	public void displayInfo() {
	     System.out.println("\nAccount Details:");
	     System.out.println("Account Number: " + acc_no);
	     System.out.println("Name: " + name);
	     System.out.println("Address: " + address);
	     System.out.println("Balance: $" + balance);
	    }
	public void deposit(double amount) {
	     if (amount > 0) {
	        balance += amount;
	        System.out.println("\nDeposited $" + amount + " successfully.");
	     } else {
	        System.out.println("\nInvalid deposit amount.");
	        }
	    }
	public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawn $" + amount + " successfully.");
        } else {
            System.out.println("\nInsufficient balance or invalid amount.");
        }
    }
	 public void changeAddress(String newAddress) {
	        this.address = newAddress;
	        System.out.println("\nAddress updated successfully.");
	    }
	 public int getAccountNumber() {
	        return acc_no;
	    }
}
class BankApplication{
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of depositors: ");
	        int numDepositors = sc.nextInt();
	        sc.nextLine(); 
	        Bank[] accounts = new Bank[numDepositors];
	        for (int i = 0; i < numDepositors; i++) {
	            System.out.println("\nEnter details for depositor " + (i + 1) + ":");
	            System.out.print("Name: ");
	            String name = sc.nextLine();
	            System.out.print("Address: ");
	            String address = sc.nextLine();
	            System.out.print("Initial Balance: ");
	            double balance = sc.nextDouble();
	            sc.nextLine(); // Consume newline
	            accounts[i] = new Bank(name, address, balance);
	            System.out.println("Account Created! Account Number: " + accounts[i].getAccountNumber());
	        }
	        while (true) {
	            System.out.println("\nSelect an operation:");
	            System.out.println("1. Display account info");
	            System.out.println("2. Deposit money");
	            System.out.println("3. Withdraw money");
	            System.out.println("4. Change address");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            if (choice == 5) {
	                System.out.println("Exiting... Thank you!");
	                break;
	            }
	            System.out.print("Enter account number: ");
	            int accNum = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            Bank selectedAccount = null;
	            for (Bank acc : accounts) {
	                if (acc.getAccountNumber() == accNum) {
	                    selectedAccount = acc;
	                    break;
	                }
	            }

	            if (selectedAccount == null) {
	                System.out.println("\nAccount not found!");
	                continue;
	            }

	            switch (choice) {
	                case 1:
	                    selectedAccount.displayInfo();
	                    break;
	                case 2:
	                    System.out.print("\nEnter deposit amount: ");
	                    double depositAmount = sc.nextDouble();
	                    selectedAccount.deposit(depositAmount);
	                    selectedAccount.displayInfo();
	                    break;
	                case 3:
	                    System.out.print("\nEnter withdrawal amount: ");
	                    double withdrawAmount = sc.nextDouble();
	                    selectedAccount.withdraw(withdrawAmount);
	                    selectedAccount.displayInfo();
	                    break;
	                case 4:
	                    System.out.print("\nEnter new address: ");
	                    String newAddress = sc.nextLine();
	                    selectedAccount.changeAddress(newAddress);
	                    selectedAccount.displayInfo();
	                    break;
	                default:
	                    System.out.println("\nInvalid choice!");
	            }
	        }
	        sc.close();
	    }
	}

