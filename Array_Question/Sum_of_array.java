package Array_Question;

import java.util.Scanner;

public class Sum_of_array {

    public static int sumOfArray(int[] arr) {
		
		
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			
			sum+=arr[i];
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      // Kitne Size ka Array Banana he...
      int n= s.nextInt();  
      int [] arr= new int[n];
      
      // Input
      for(int i=0; i<arr.length;i++) {
    	  arr[i]= s.nextInt();
      }
      
       int ans=sumOfArray(arr);
       System.out.println(ans);
      
      
	}

	

}
