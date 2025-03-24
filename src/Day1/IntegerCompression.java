package Day1;
import java.util.Scanner;
public class IntegerCompression {
	    public static int encode(int num) {
	        return (num << 2) ^ 0b10101; 
	    }
	    public static int decode(int encoded) {
	        return (encoded ^ 0b10101) >> 2;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer to encode: ");
	        int original = scanner.nextInt();
	        
	        scanner.close();
	        int encoded = encode(original);
	        int decoded = decode(encoded);
	        System.out.println("Encoded Value: " + encoded);
	        System.out.println("Decoded Value: " + decoded);
	    }
	}
