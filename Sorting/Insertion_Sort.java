package Sorting;

public class Insertion_Sort {
	   // i denote last index of Sorted Array.
		// temp is a Value which we want to insert at Correct Position.
	public static void Insert(int [] arr, int i, int temp) {
	
		
		  while(i>=0 && arr[i]> temp) {	  
			  // Shift
			  arr[i+1]=arr[i];
			  i--;
		  }
		  
		  arr[i+1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {6,1,3,2,5,7,4,10};
       
       
       for(int i=0; i<arr.length-1;i++) {
    	   
    	   Insert(arr, i, arr[i+1]);
       }
       
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
