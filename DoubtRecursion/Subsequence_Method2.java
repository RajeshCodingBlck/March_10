import java.util.*;
public class Main {
  
    public static int printSubSeq(String str ,String ans){
       
	   if(str.length()==0){
		   System.out.print(ans+" ");
		   return 1;
	   }
      char ch= str.charAt(0);
     int chhota_ans1= printSubSeq( str.substring(1) , ans+""); // 0th index character ko na le.
	  int chhota_ans2= printSubSeq(str.substring(1), ans+ch);// ya to le .

	  int mera_ans= chhota_ans1+chhota_ans2;
	  return mera_ans;

	}
    public static void main(String args[]) {
        // Your Code Here

		Scanner s= new Scanner(System.in);
		String str= s.next();
        int count= printSubSeq(str, "");
		 System.out.println();
		 System.out.println(count);
    }
}
