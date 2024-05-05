package Array_Question;

public class maximumValueOfArray {

	public static int getMax(int [] arr) {
		
		int maxValue= arr[0];
		
		for(int i=1; i<arr.length;i++) {	
			if(arr[i]> maxValue) {
				maxValue=arr[i];
			}
		}
		return maxValue;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,10,2,1,40,3};
       
       int maxValue= getMax(arr);
       System.out.println(maxValue);
       
	}

}
