package Day4;
	import java.io.*;
	import java.util.Scanner;
	class EmptyFileException extends Exception {
	    public EmptyFileException(String message) {
	        super(message);
	    }
	}

	public class Fileprocessor {
	    public static void main(String[] args) {
	        String fileName = "numbers.txt"; // Change this to the actual file name

	        try {
	            int sum = readAndSumFromFile(fileName);
	            System.out.println("Sum of numbers: " + sum);
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found - " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Invalid number format - " + e.getMessage());
	        } catch (EmptyFileException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    public static int readAndSumFromFile(String fileName) throws FileNotFoundException, EmptyFileException {
	        int sum = 0;
	        boolean isEmpty = true;
	        try (Scanner scanner = new Scanner(new File(fileName))) {
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine().trim();
	                if (!line.isEmpty()) {
	                    isEmpty = false;
	                    sum += Integer.parseInt(line); 
	                }
	            }
	        }

	        if (isEmpty) {
	            throw new EmptyFileException("The file is empty.");
	        }

	        return sum;
	    }
	}
