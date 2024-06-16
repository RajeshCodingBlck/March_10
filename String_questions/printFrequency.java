package String_questions;

public class printFrequency {
   
	public static void printFre(String str) {
		
		int [] fre=new int[256];
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			int ascii=ch;
			fre[ascii]=fre[ascii]+1;
		}
		for(int i=0;i<256;i++) {
			
			if(fre[i]>0) {
				char ch= (char)(i);
				System.out.println(ch + " , "+ fre[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str= "ababacd";
     printFre(str);
	}

}
