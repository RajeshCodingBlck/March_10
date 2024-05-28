package Lec_5;

import java.util.Scanner;

public class Number_pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      
      int row=1;
      
      int nsp=n-1;
      int nst=1;
      
     
      while(row<=n) {
    	  
    	  // work
    	  // Print the Space
    	 
    	  int i=1;
    	  while(i<=nsp) {
    		  System.out.print(" "+"\t");
    		  i=i+1;
    	  }
    	  
    	  // Print the Star
    	  int j=1;
    	  //int val=1;
    	  int count=1;
    	  while(j<=nst) {
    		  
    		  System.out.print(count+"\t");
    		  count++;
    		  j=j+1;
    	  }
    	  
    	  // preparation for Next row
    	  nsp=nsp-1;
    	  nst=nst+2;
    	  
    	  
    	  row=row+1;
    	  System.out.println();
      }
      
	}

}
