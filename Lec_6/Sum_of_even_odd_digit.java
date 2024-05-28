package Lec_6;

import java.util.Scanner;

public class Sum_of_even_odd_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int even_sum=0;
		int odd_sum=0;
		
		while(n>0) {
			
			int last_digit= n%10;
			
			if(last_digit%2==0) {
				even_sum +=last_digit;
			}else {
				odd_sum+=last_digit;
			}
			
			n=n/10;
		}
		System.out.println("Even Sum is "+ even_sum);
		System.out.println("Odd Sum is "+ odd_sum);
		
		
		
	}

}
