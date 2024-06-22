package String_questions;

import java.util.Scanner;


public class GoodSubString {
    
	public static int lengthGoodString(String str) {
		
		int curr_length=0;
		int overAllMaxlength=0;
		
		for(int i=0; i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch=='a'||
			   ch=='e'||
			   ch=='i'||
			   ch=='o'||
			   ch=='u') {
				curr_length++;
			}else {
				overAllMaxlength= Math.max(overAllMaxlength,curr_length);
				curr_length=0;
			}
		}
		overAllMaxlength= Math.max(overAllMaxlength,curr_length);
		
	return overAllMaxlength;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      String str= s.next();
      int ans=lengthGoodString(str);
      System.out.println(ans);
	}

}
