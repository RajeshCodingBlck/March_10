package Lec_6;

import java.util.Scanner;

public class reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        
        int reverse_number=0;
        
        while(n>0) {
        	
        	int last_digit= n%10;
        	
        	//System.out.print(last_digit);
        	
        	reverse_number= reverse_number*10+ last_digit;
        	n=n/10;
        }
        
        System.out.println(reverse_number);
        
        
        
	}

}
