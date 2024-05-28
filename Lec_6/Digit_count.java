package Lec_6;

import java.util.Scanner;

public class Digit_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		
		
		int count=0;
		
		for( int n= s.nextInt();n>0; n= n/10) {
			
			
			count++;
		}
		
		System.out.println(count);
		
	}

}
