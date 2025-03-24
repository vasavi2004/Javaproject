package Day1;

import java.util.Scanner;

public class Poweroftwo {
	public static boolean isPowerOfTwo(int n) {
		return n>0&&(n&(n-1))==0;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		sc.close();
		if(isPowerOfTwo(n)) {
			System.out.println("Yes, it is a power of two");	
		}
		else {
			System.out.println("No, it is a power of two");
		}
		
	}
}
