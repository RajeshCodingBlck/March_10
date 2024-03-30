package Lec_4;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      
      int row=1;
      
      // Observe
       int nsp=0;
       int nst=2*n-1;
       
      while(row<=n) {
    	  
    	  
    	  // work
    	  
    	  // print the Space
    	  int i=1;
    	  while(i<=nsp) {
    		  System.out.print(" "+" ");
    		  i=i+1;
    	  }
    	  
    	  // Print the Star
    	  int j=1;
    	  while(j<=nst) {
    		  
    		  System.out.print("*"+" ");
    		  j=j+1;
    	  }
    	  
    	  // preparation for Next row
    	  nsp=nsp+1;
    	  nst=nst-2;
    	  
    	  row=row+1;
    	  System.out.println();
      }
      
      
	}

}
