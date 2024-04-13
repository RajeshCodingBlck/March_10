package Lec_7;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in); 
       int n= s.nextInt();
       
       int place_value=1;
       int ans=0;
       while(n>0) {
    	   
    	   int last_digit= n%10;
    	   ans= ans+ last_digit*place_value;
    	   n=n/10;
    	   place_value*=2;
       }
       System.out.println(ans);
       
       
	}

}
