package Array_Question;

public class Reverse_the_Array {
    
	public static void printInReverse(int [] arr) {
		
		
		for(int i= arr.length-1; i>=0;i--) {
			
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3,4,5,6,7};
		printInReverse(arr);
		
	}

}
