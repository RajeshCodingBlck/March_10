package Lec_6;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner s= new Scanner(System.in);
           
           int dividend= s.nextInt();
           int divisor= s.nextInt();
           
            while(dividend%divisor !=0) {
            	
            	int rem=dividend%divisor;
            	
            	dividend= divisor;
            	divisor= rem;
            	
            }
            
            System.out.println(divisor);
           
	}

}
