package recursion_2;

import java.util.Scanner;

public class Pow_function {

	// (a, b)-> a^b
	public static int myPow(int a, int b) {
		
		if(b==0) {
			return 1;
		}
		
	  int chhota_ans=myPow(a, b-1);
	  int mera_ans= a*chhota_ans;
	  return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int a= s.nextInt();
       int b= s.nextInt();
       System.out.println(myPow(a,b));
	}

}
