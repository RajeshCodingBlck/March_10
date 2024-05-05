package Array_Question;

import java.util.Scanner;

public class Reverse_in_Range {
	 public static void reverse(int [] arr, int s, int e) {
		   
		   int i=s;
		   int j=e;
		   
		   while(i<j) {
			   
			   // Swap
			   int temp= arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			   i++;
			   j--;
		   }
				   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5,6,7,8,9};
      Scanner s= new Scanner(System.in);
      int start= s.nextInt();
       int end= s.nextInt();
      reverse(arr, start, end);
      for(int i=0; i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
