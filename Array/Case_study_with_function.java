package Array;

public class Case_study_with_function {

	public static void Swap(int [] arr, int [] brr) {
		
		int [] temp= arr;
		arr=brr;
		brr=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,3,4,5};
     int [] brr= {10,20,30,40,50};
     
     System.out.println("before the Swap "+ arr[0]+"," + brr[0]);
     Swap(arr, brr);
     System.out.println("After the Swap "+ arr[0]+"," + brr[0]);
	}

}
