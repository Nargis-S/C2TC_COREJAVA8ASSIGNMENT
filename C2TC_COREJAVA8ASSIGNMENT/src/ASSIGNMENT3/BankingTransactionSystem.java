package ASSIGNMENT3;

public class BankingTransactionSystem {
	
	// Main class to demonstrate everything

	    public static void main(String[] args) {
	        SavingsAccount savings = new SavingsAccount("SA123", 1000);
	        CheckingAccount checking = new CheckingAccount("CA456", 500);

	        System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());

	        Transaction txn = new Transaction();
	        txn.performTransaction(savings, "deposit", 200);
	        txn.performTransaction(checking, "withdraw", 100);

	        savings.displayAccountInfo();
	        checking.displayAccountInfo();

	        System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());
	    }
	}

