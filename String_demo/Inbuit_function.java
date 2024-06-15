package String_demo;

public class Inbuit_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "HHHMMMEE";
        // String ki Length 
        System.out.println(str.length());
        // finding the Character at Any index/.
        System.out.println(str.charAt(1));
        
       // str.charAt(0)='h';
//      Character ko Update Nahi kar Sakte
        
        String str1= new String("Hello");
        String str2= new String("Hello");
        
        if(str1.equals(str2)) {
        	System.out.println("Me Same Hu");
        }else {
        	System.out.println("Me Same nahi hu");
        }
        
        // Substring
        System.out.println(str.substring(2,6)); 
//        [2,6]-> [2,5]
        
        String str3="abcd";
        String str4= "abcd";
        System.out.println(str4.compareTo(str3));
        
        
        // Ascii
       char ch= ' ';
       int val= ch;
       System.out.println(val);
        
        
        
        
        
        
	}

}
