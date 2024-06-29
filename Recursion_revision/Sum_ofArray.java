package Recursion_revision;

public class Sum_ofArray {

	// i index se Start hone vale Array Sum dega.
	public static int SumArray(int [] arr, int i) {
		
		if(i==arr.length) {
			return 0;
		}
		
		int chhota_ans=SumArray(arr,i+1);
		int sum= arr[i]+ chhota_ans;
		return sum;
	}
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
        int [] arr= {1,2,3,4,5};
        System.out.println(SumArray(arr, 0));
	}

}
