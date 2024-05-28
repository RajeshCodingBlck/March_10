package TwoD_Array;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// How to Create 2D Array
		int [][] arr= new int [3][4];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(arr[0][3]);
		
		
		// Input
		
		Scanner s= new Scanner(System.in);
		
		// loop for row
		for(int i=0; i<3;i++) {	
			// loop for colums
			for(int j=0; j<4;j++) {		
				arr[i][j]=s.nextInt();
			}
		}
		
		
		
		
	}

}
