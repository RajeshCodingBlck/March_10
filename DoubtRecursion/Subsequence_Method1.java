import java.util.*;
public class Main {
    static int count=0;
    public static void printSubSeq(String str ,String ans){
       
	   if(str.length()==0){
		   System.out.print(ans+" ");
		   count++;
		   return ;
	   }
      char ch= str.charAt(0);
      printSubSeq( str.substring(1) , ans+""); // 0th index character ko na le.
	  printSubSeq(str.substring(1), ans+ch);// ya to le .

	}
    public static void main(String args[]) {
        // Your Code Here

		Scanner s= new Scanner(System.in);
		String str= s.next();
         printSubSeq(str, "");
		 System.out.println();
		 System.out.println(count);
    }
}
