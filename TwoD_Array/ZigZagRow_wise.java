package TwoD_Array;

public class ZigZagRow_wise {
  
	public static void ZigZag(int [][] arr) {
		
		int row= arr.length;
		int col= arr[0].length;
		for(int i=0; i<row; i++) {
//			 row ki value -> left to right;
			 if(i%2==0) {	 
				 for(int j=0; j<col;j++) {
					 System.out.print(arr[i][j]+" ");
				 }	 
			 }else {
				// row ki value -> right to left; 
				 for(int j=col-1; j>=0;j--) {
					 System.out.print(arr[i][j]+" ");
				 }
			 } 
			 System.out.println();
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
