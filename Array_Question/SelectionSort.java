package Array_Question;

public class SelectionSort {
   
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
    
    public static void SelectionSort(int [] arr) {
    	
    	for(int i=0; i<arr.length;i++) {
    		
    		int minindex= MinIndexInRange(arr, i, arr.length-1);
    		
    		int temp=arr[i];
    		arr[i]=arr[minindex];
    		arr[minindex]=temp;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,0,4,3,1};
       
       SelectionSort(arr);
       
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
         
	}

}
