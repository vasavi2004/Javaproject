package Day2andDay3;

class Product {
	    private String name;
	    private double price;
	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    public boolean equals(Object obj) {
	        if (this == obj) return true; 
	        if (obj == null || getClass() != obj.getClass())
	        	return false; 

	        Product product = (Product) obj; // Typecast to Product
	        return Double.compare(product.price, this.price) == 0 && this.name.equals(product.name);
	    }

	    public static void main(String[] args) {
	        Product p1 = new Product("Laptop", 50000);
	        Product p2 = new Product("Laptop", 50000);
	        Product p3 = new Product("Phone", 30000);
	        Product p4 = new Product("Laptop", 55000);
	        System.out.println(p1.equals(p2)); 
	        System.out.println(p1.equals(p3)); 
	        System.out.println(p1.equals(p4)); 
	    }
	}