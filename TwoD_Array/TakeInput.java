package TwoD_Array;

import java.util.Scanner;

public class TakeInput {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s= new Scanner(System.in);
		 int n= s.nextInt();// 
		 int m=s.nextInt();
       int [][] arr= new int [n][m];
      
       // first loop for Row
       for(int i=0;i<n;i++) {
    	   for(int j=0; j<m;j++) {
    		   arr[i][j]=s.nextInt();
    	   }
       }
       
       // Print 
       // for the Row
       for(int i=0; i<n;i++) {
    	   
    	   // for the col
    	   for(int j=0; j<m;j++) {
    		   
    		   System.out.print(arr[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}
