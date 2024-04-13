package Lec_7;

import java.util.Scanner;

public class Decimal_Any_base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		  
		  int n= s.nextInt();
		  int base= s.nextInt();
		  
		  int ans=0;
		  int place_value=1;
		  
		   while(n>0) {
			   
			   int rem= n%base;
			   ans= rem*place_value+ ans;
			   
			   n=n/base;
			   place_value *=10;
			   
		   }
		   
		   System.out.println(ans);
	}

}
