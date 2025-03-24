package Day2andDay3;

	// Abstract class representing a product
	abstract class Product {
	    protected double price; // Price of the product

	    // Constructor to initialize product price
	    public Product(double price) {
	        this.price = price;
	    }

	    // Abstract method to be implemented by subclasses
	    public abstract double calculateDiscount();
	}

	// Electronics class extending Product
	class Electronics extends Product {
	    public Electronics(double price) {
	        super(price);
	    }

	    @Override
	    public double calculateDiscount() {
	        return price * 0.10; // 10% discount for electronics
	    }
	}

	// Clothing class extending Product
	class Clothing extends Product {
	    public Clothing(double price) {
	        super(price);
	    }

	    @Override
	    public double calculateDiscount() {
	        return price * 0.05; // 5% discount for clothing
	    }
	}

	// Main class to test the functionality
	public class OnlineshoppingSystem{
	    public static void main(String[] args) {
	        // Creating objects for Electronics and Clothing
	        Product phone = new Electronics(50000);
	        Product shirt = new Clothing(2000);

	        // Displaying discount amounts
	        System.out.println("Phone Discount: " + phone.calculateDiscount()); // Output: 5000.0
	        System.out.println("Shirt Discount: " + shirt.calculateDiscount()); // Output: 100.0
	    }
	}
