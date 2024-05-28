package Array_Question;

public class MinValueIndex {

	public static int MinIndex(int [] arr) {
		
		int minVal=arr[0];
		int index=0;
		
		for(int i=1;i<arr.length;i++) {
			
			if(minVal>arr[i]) {
				minVal=arr[i];
				index=i;
			}
		}
		return  index;
	}
	
	public static int MinIndexInRange(int [] arr, int s, int e) {
		
		int minVal=arr[s];
		int index=s;
		
		for(int i=s+1; i<=e;i++) {
			
			if(minVal>arr[i]) {
				minVal=arr[i];
				index=i;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,1,3,2,0,3};
      
      System.out.println(MinIndexInRange(arr,1,4));
      
	}

}
