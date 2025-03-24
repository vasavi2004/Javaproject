package Day1;
import java.util.Scanner;
public class DiscountCalculator {
	    public static double calculateFinalPrice(double cartValue) {
	        double discount = 0;
	        if (cartValue > 500) {
	            discount = 0.20 * cartValue; 
	        } else if (cartValue >= 100 && cartValue <= 500) {
	            discount = 0.10 * cartValue; 
	        }

	        return cartValue - discount; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the cart value: $");
	        double cartValue = scanner.nextDouble();

	        scanner.close(); 
	        double finalPrice = calculateFinalPrice(cartValue);
	        System.out.println("Final price after discount: $" + String.format("%.2f", finalPrice));
	    }
	}
