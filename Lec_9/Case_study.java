package Lec_9;

public class Case_study {
     
//	case-Study 1
//	 Missing Return Statement in Function
//   public static int fun(){
//        
//        int val=12;
//        System.out.println(val);
//    }
	
//	  Cse -study-2
//	   return Keywords se forcefullyfunction ko Bhasam Karne ke Kaam aata he.
//	   uske Niche ke code nahi reach Kar kar sakte .
//      So it will Give Error.
	
	 //public static int fun(){
//	        System.out.println("hello fun");
//	        int val=12;
//	        System.out.println(val);
//	        return val;
//	        System.out.println("Bye Fun");
//	    }
	
//	Case-study-3
//	Conditional returning Give Error because it not fullfill our promise of Return
//	public static int fun(){
//        System.out.println("hello fun");
//        int val=12;
//        System.out.println(val);
//       
//        if(val==12){
//            return val;
//        }
//        
//        
//    }
	
//	Case-Study4
//	 Function required two Arguments, but passing one argument
//public static int fun(int a, int b){
//        
//        System.out.println("Hello from fun");
//        
//        int ans=a+b;
//        System.out.println(ans);
//        return ans;
//    }
	
    // Work Proper....
//public static int fun(int a, int b){
//        
//        System.out.println("Hello from fun");
//        
//        int ans=a+b;
//        System.out.println(ans);
//        return ans;
//    }
    public static void main(String[] args) {
        System.out.println("Hello from Main");
        //fun(34,45);
        
    }
	

}
