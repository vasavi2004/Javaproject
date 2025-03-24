package Day2andDay3;

	class Payment {
	    void pay(double amount) {
	        System.out.println("Paid " + amount + " using Default Payment Method.");
	    }
	    void pay(double amount, String method) {
	        System.out.println("Paid " + amount + " using " + method + ".");
	    }
	    void pay(double amount, String method, int emiMonths) {
	        System.out.println("Paid " + amount + " using " + method + " with EMI for " + emiMonths + " months.");
	    }
	}

	public class Paymentsystem {
	    public static void main(String[] args) {
	        Payment p = new Payment();
	        p.pay(1000); 
	        p.pay(2000, "Credit Card"); 
	        p.pay(5000, "UPI", 12); 
	    }
	}
