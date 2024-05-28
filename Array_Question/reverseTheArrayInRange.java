package Array_Question;

public class reverseTheArrayInRange {
   public static void reverse(int [] arr) {
	   
	   int i=0;
	   int j=arr.length-1;
	   
	   while(i<j) {
		   
		   // Swap
		   int temp= arr[i];
		   arr[i]=arr[j];
		   arr[j]=temp;
		   i++;
		   j--;
	   }
	   
//	   for( int i=0, j= arr.length-1 ;i<j;i++, j--) {
//		   int temp= arr[i];
//		   arr[i]=arr[j];
//		   arr[j]=temp;
//		   i++;
//		   j--;
//	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,3,4,5,6,7,8};
     reverse(arr);
     
     for(int i=0; i<arr.length;i++) {
    	 System.out.print(arr[i]+" ");
     }
     
	}

}
