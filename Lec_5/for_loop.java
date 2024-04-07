package Lec_5;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
//		for( int i=1   ;  i<=n  ; i++ ) {
//			
//			System.out.println(i);
//		}
		
		int sum=0;
		
		for(int i=1; i<=n;i++) {
			
			sum= sum+i;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
	}

}
