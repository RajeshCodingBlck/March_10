package TwoD_Array;

import java.util.Scanner;

public class Displayfunction {
   public static void display(int [][] arr) {
	   
	   int row= arr.length; // Number of rows
	   int col= arr[0].length; // Number of cols
	  
	   for(int i=0; i<row;i++ ) {
		   for(int j=0; j<col;j++) {
			   System.out.print(arr[i][j]+" ");
		   }
		   
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		 int n= s.nextInt();// 
		 int m=s.nextInt();
      int [][] arr= new int [n][m];
//     
      // first loop for Row
      for(int i=0;i<n;i++) {
   	   for(int j=0; j<m;j++) {
   		   arr[i][j]=s.nextInt();
   	   }
      }
      
      display(arr);
	}

}
