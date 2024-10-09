import java.util.*;
public class Main {

    // i index se Start hone Vala array Par kaam karna ..
	public static int lastIndex(int [] arr, int i, int m){
       
	   if(arr.length==i){
             return -1;
	   }

      int chhota_ans=lastIndex(arr, i+1,m);

	  if(chhota_ans ==-1){

           if(arr[i]==m){
			   return i;
		   }else{
			  return -1; 
		   }
	  }else{
		  return chhota_ans;
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

		int index= lastIndex(arr, 0, m);
		System.out.println(index);
    }
}
