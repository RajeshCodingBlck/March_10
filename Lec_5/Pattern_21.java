package Lec_5;

import java.util.Scanner;

public class Pattern_21 {

	
	public static void main(String [] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int row=1;
		int nst_l=1;
		int nst_r=1;
		int nsp=2*n-3;
		
		while(row<=n) {
			
			// work
			
			// Print the Left Star
			int i=1;
			while(i<=nst_l) {
				System.out.print("*"+ " ");
				i=i+1;
			}
			
			// Print the Space
			int j=1;
			while(j<=nsp) {
				
				System.out.print(" "+" ");
				j=j+1;
				
			}
			
			// Print the Right Star
			int k=1;
			if(row==n) {
				k=2;
			}
			while(k<=nst_r) {
				System.out.print("*"+" ");
				k=k+1;
			}
			
			// Preparation for Next row
			nst_l=nst_l+1;
			nst_r=nst_r+1;
			nsp=nsp-2;
			
			
			row=row+1;
			System.out.println();
		}
		
	}
}
