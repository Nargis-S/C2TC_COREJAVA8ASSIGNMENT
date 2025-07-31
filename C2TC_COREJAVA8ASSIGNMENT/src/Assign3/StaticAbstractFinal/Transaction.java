package Assign3.StaticAbstractFinal;

public class Transaction {
	
	// 3. Final part

	    public final double transactionFee = 2.0;

	    public final void performTransaction(Account account, String type, double amount) {
	        System.out.println("--- Performing Transaction ---");
	        if (type.equalsIgnoreCase("deposit")) {
	            account.deposit(amount);
	            account.balance -= transactionFee;
	            System.out.println("Transaction fee of " + transactionFee + " applied.");
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            account.withdraw(amount);
	            account.balance -= transactionFee;
	            System.out.println("Transaction fee of " + transactionFee + " applied.");
	        } else {
	            System.out.println("Invalid transaction type!");
	        }
	        System.out.println("Transaction Completed. Final Balance: " + account.getBalance());
	    }
	}

