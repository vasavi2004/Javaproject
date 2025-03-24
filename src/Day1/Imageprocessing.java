package Day1;
import java.util.Scanner;
public class Imageprocessing {
	    public static int toGrayscale(int red, int green, int blue) {
	        int grayscale = ((red * 77) + (green * 150) + (blue * 29)) >> 8; 
	        return grayscale;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Red value (0-255): ");
	        int red = sc.nextInt();

	        System.out.print("Enter Green value (0-255): ");
	        int green = sc.nextInt();

	        System.out.print("Enter Blue value (0-255): ");
	        int blue = sc.nextInt();

	        sc.close(); 

	        int gray = toGrayscale(red, green, blue);
	        System.out.println("Grayscale Value: " + gray);
	    }
	}