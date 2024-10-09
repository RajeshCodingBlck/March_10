import java.util.*;
public class Main {

    // i index se Start hone Vala array Par kaam karna ..
	public static int lastIndex(int [] arr, int i, int m){
        
		if(i==-1){
			return -1;
		}
	  
	     if(arr[i]==m){
			 return i;
		 }else{

			return lastIndex(arr, i-1, m); 
		 }

	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner s= new Scanner(System.in);

		int n= s.nextInt();
		int [] arr= new int[n];
		for(int i=0; i<n;i++){
			arr[i]=s.nextInt();
		}

		int m= s.nextInt();

		int index= lastIndex(arr, arr.length-1, m);
		System.out.println(index);
    }
}
