package Array_Question;

public class SubArray {

	public static void PrintSubarray(int [] arr) {
		
		for(int s=0; s<arr.length;s++) {
			
			for(int e=s; e<arr.length;e++) {
				
				System.out.println("(Cut is "+ s+" ,"+e+")");
				
				for(int k=s; k<=e;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {1,2,3,4};
		
		PrintSubarray(arr);
	}

}
 