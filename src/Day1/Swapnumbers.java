package Day1;

public class Swapnumbers {
	public static void main(String args[]) {
		int a=10,b=20;
		System.out.println("Before Swap:"+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after Swap:"+a+","+b);
	}

}
