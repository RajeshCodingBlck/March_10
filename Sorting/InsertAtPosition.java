package Sorting;

public class InsertAtPosition {
   
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
      int [] arr= {2,3,5,6,7,8,1};
      int n=arr.length;
      Insert(arr, n-2,arr[n-1]);
      
      for(int i=0; i<n;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
      
	}

}
