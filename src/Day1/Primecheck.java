package Day1;

import java.util.Scanner;

public class Primecheck {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println("Yes,"+num+" is a prime number");
		}else {
			System.out.println("No,"+num+" is not a prime number");
		}
	}
public static boolean isPrime(int num) {
	if (num < 2) {
		return false; 
	}
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false; 
        }
    }
    return true;	
}
}
