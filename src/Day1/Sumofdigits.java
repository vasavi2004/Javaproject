package Day1;

import java.util.Scanner;

public class Sumofdigits {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int num=sc.nextInt();
		sc.close();
		int sum=0,temp=num;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
			
		}
		
		System.out.println(+sum);
	}

}
