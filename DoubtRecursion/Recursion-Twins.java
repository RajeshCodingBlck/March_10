import java.util.*;
public class Main {

	public static int countTwin(String str){

		// Base Case

		if(str.length()==0  || str.length()==1 || str.length()==2){ // +Ve Base Case
			return 0;
		}

       // 0th Index par kya kaam karna he.


	   if(str.charAt(0)== str.charAt(2)){

		  int mera_ans=1; // ak Twin ka count add ho jayga .
		   int chhota_ans= countTwin(str.substring(1));
           
		   mera_ans+=chhota_ans;
		   return mera_ans;
	   }else{
          
		   int mera_ans=0;
		   int chhota_ans= countTwin(str.substring(1));
           
		   mera_ans+=chhota_ans;
		   return mera_ans;
	   }



	}
    public static void main(String args[]) {
        // Your Code Here
       Scanner s= new Scanner(System.in);

	   String str= s.next(); // String Ka input le liya.

	   int count= countTwin(str);
	   System.out.println(count);

    }
}
