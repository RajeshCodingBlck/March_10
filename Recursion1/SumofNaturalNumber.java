package Recursion1;

public class SumofNaturalNumber {

	public static int Sumofnatural(int n) {
		
		if(n==0) {
			return 0;
		}
		// Define the Sub Problem
		int chhota_ans=Sumofnatural(n-1);
		int mera_ans= chhota_ans+n;	
		return mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( Sumofnatural(8));
	}

}
