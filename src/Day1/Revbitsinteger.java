package Day1;

public class Revbitsinteger {
	public static void main(String args[]) {
		int num=5;
		int revnum=reverseBits(num);
		System.out.println("Reversed Binary:"+Integer.toBinaryString(revnum)+"(Equivalent Decimal:"+revnum+")");
	}
	public static int reverseBits(int num){
		int result=0;
		for(int i=0;i<8;i++) {
			result <<=1;
			result |= (num&1);
			num>>=1;
			
		}
		return result;
	}

}
