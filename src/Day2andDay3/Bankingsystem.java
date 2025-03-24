package Day2andDay3;

	class BankAccount {
	    private double balance;
	    private String owner;
	    public BankAccount() {
	        this(0, "Unknown"); 
	    }
	    public BankAccount(double balance) {
	        this(balance, "Unknown"); 
	    }
	    public BankAccount(double balance, String owner) {
	        this.balance = balance;
	        this.owner = owner;
	        System.out.println("Account created for " + owner + " with balance: " + balance);
	    }
	}

	public class Bankingsystem {
	    public static void main(String[] args) {
	        BankAccount acc1 = new BankAccount();
	        BankAccount acc2 = new BankAccount(1000);
	        BankAccount acc3 = new BankAccount(5000, "John Doe");
	    }
	}
