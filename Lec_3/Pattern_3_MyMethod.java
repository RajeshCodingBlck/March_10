package Lec_3;

import java.util.Scanner;

public class Pattern_3_MyMethod {

	  public static void main(String [] args) {
		  
		  
		  Scanner s= new Scanner(System.in);
		  
		   int n= s.nextInt();
		   
		   int row=1; 
		   // Oberservation
		   int nst= 1; // nst-> no of Star in first row
		   
		   while(row<=n) {
			   
			   // work for the first row
			   
			   int i=1;
			   while(i<=nst) {
				   System.out.print("*");
				   i=i+1;
			   }
			    
			   // Preparation for Next row
			   nst=nst+1;
			   
			   row=row+1;
			   System.out.println();
			   
		   }
	  }
}
