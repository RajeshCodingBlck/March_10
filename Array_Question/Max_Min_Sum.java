package Array_Question;

public class Max_Min_Sum {

	public static int [] getMinMaxSum(int [] arr) {
		
		int sum=arr[0];
		int minValue=arr[0];
		int maxValue=arr[0];
		
		for(int i=1;i< arr.length;i++) {
			
			sum+=arr[i];
			
			if(arr[i]< minValue) {
				minValue=arr[i];
			}
			
			if(arr[i]> maxValue) {
				maxValue=arr[i];
			}
		}
		
		int [] ans= new int[3];
		ans[0]=sum;
		ans[1]=minValue;
		ans[2]=maxValue;
		
		
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5};
       int [] ans= getMinMaxSum(arr);
       
       //System.out.println(ans);
       
       for(int i=0; i<ans.length;i++) {
    	   System.out.print(ans[i]+" ");
       }
       
	}

}
