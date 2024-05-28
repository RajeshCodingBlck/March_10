package Array;

public class Case_study_2_with_function {

	public static void Swap(int [] arr, int i, int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4};
      
      System.out.println("Before Swap"+ arr[0]+ ","+arr[1]);
      Swap(arr, 0,1);
      System.out.println("After Swap"+ arr[0]+ ","+arr[1]);
	}

}
