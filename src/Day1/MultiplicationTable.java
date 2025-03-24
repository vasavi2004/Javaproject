package Day1;
import java.util.Scanner;
public class MultiplicationTable {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char choice;

	        do {
	            System.out.print("Enter a number for the multiplication table: ");
	            int N = scanner.nextInt();
	            System.out.println("\nMultiplication Table of " + N + " using for loop:");
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(N + " x " + i + " = " + (N * i));
	            }
	            System.out.println("\nMultiplication Table in Reverse Order:");
	            for (int i = 10; i >= 1; i--) {
	                System.out.println(N + " x " + i + " = " + (N * i));
	            }
	            System.out.print("\nEnter the start of the range: ");
	            int start = scanner.nextInt();
	            System.out.print("Enter the end of the range: ");
	            int end = scanner.nextInt();

	            System.out.println("\nMultiplication Table from " + start + " to " + end + " using while loop:");
	            int i = start;
	            while (i <= end) {
	                System.out.println(N + " x " + i + " = " + (N * i));
	                i++;
	            }
	            System.out.print("\nDo you want to generate another table? (y/n): ");
	            choice = scanner.next().charAt(0);

	        } while (choice == 'y' || choice == 'Y');

	        System.out.println("Program Ended.");
	        scanner.close();
	    }
	}

