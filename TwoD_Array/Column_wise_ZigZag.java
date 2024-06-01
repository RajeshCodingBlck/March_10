package TwoD_Array;

public class Column_wise_ZigZag {
    
	public static void ZigZag(int [][] arr) {
		// loop for col
		for(int j=0; j<arr[0].length;j++) {
			if(j%2==0) {
   		//   move from Up ->down
				for(int i=0; i<arr.length;i++) {
					System.out.print(arr[i][j]+" ");
				}
				
			}else {			
			//move from Down ->Up
				for(int i=arr.length-1; i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {
		        {1,2,3,4},
		        {5,4,3,2},
		        {4,3,2,1},

              };
        ZigZag(arr);
	}

}
