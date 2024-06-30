package recursion_2;

public class ReversetheArray {
   
	public static void reverseTheArray(int [] arr, int i, int j) {
		
		// Base Case
		if(i>j) {
			return ;
		}
	
		reverseTheArray(arr, i+1, j-1);
		
		// Swap
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,6,7};
       reverseTheArray(arr,0, arr.length-1);
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
	}

}
