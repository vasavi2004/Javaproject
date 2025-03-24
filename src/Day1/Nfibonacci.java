package Day1;

import java.util.Scanner;

public class Nfibonacci {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		int n=sc.nextInt();
		sc.close();
		if(n<=0) {
			System.out.println("Output:");
			return;
		}
		int a=0,b=1,count=0;
		System.out.print("Output:"+a);
		count++;
		if(n>1) {
			System.out.print(","+b);
		}do {
			int next=a+b;
			System.out.print(","+next);
			a=b;
			b=next;
			count++;
		}while(count<n);
	}

}
