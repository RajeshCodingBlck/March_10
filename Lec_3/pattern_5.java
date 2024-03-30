package Lec_3;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
       
       int row=1;
       
       // Observation 
       int nst=1;
       int no_of_doller=n-1;
       
       while(row<=n) {
    	   
    	   // work for Next
    	  
    	   // Print the dollar
    	   int i=1;
    	   while(i<=no_of_doller) {
    		   System.out.print("$");
    		   i=i+1;
    		   		
    	   }
    	   
    	   // Print the Star
    	   
    	   int j=1;
    	   while(j<=nst) {
    		   
    		   System.out.print("*");
    		   j=j+1;
    	   }
    	   
    	   // Preparation for Next
    	   no_of_doller= no_of_doller-1;
    	   nst= nst+1;
    	   
    	   row=row+1;
    	   System.out.println();
       }
	}

}
