package Recursion_Revision2;

public class Fibonacci {

	
	public static int fibo(int n) {
		
		   if(n==0) {
			   
			   return 0;
		   }
		   
		   if(n==1) {
			   return 1;
		   }
		 int chhota_ans1= fibo(n-1);
		 int chhota_ans2= fibo(n-2);
		 
		 
		 int mera_ans= chhota_ans1+chhota_ans2;
		 return mera_ans;
		 
	}
	
//	TC -> O(2^n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int ans= fibo(6);
		System.out.println(ans);
	}

}
