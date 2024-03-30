package Lec_4;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        
        int row=1;
        // Observe the 1st Row
        int nsp=0;
        int nst=n;
        
        while(row<=n) {
        	
        	// work for 1st Row
        	int i=1;
        	while(i<=nsp) {
        		System.out.print(" ");
        		i=i+1;
        	}
        	
        	// Print the Star
        	
        	int j=1;
        	while(j<=nst) {
        		System.out.print("*");
        		j=j+1;
        	}
        	
        	// preparation for Next row
        	nsp=nsp+1;
        	nst=nst-1;
        	
        	row=row+1;
        	System.out.println();
        	
        }
        
	}

}
