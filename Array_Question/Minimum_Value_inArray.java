package Array_Question;

public class Minimum_Value_inArray {

	public static int GetMin(int [] arr) {
		
		int min_value=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			if(min_value> arr[i]) {
				min_value=arr[i];
			}
		}
		return min_value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {3,2,10,3,12,5,3};
     
     int min_value= GetMin(arr);
     System.out.println(min_value);
     
     
	}

}
