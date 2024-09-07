// "static void main" must be defined in a public class.
// Public :-  Access Everywhere
// private :- Access within  Class;
// Default :- No keyword is required and 
//            Visible only on Sam Package.
// Final :-   It make your Varible to a constant varible.

// Static function
//  Static function can accessable through class Name as well as object Name.
//  from Inside the  Static function, we can only access Static members (function and Varibles).
// from Inside the  Static function, we cann't access Non Static members( Object oriented function and Varible ).

 
class A { 
	// State
	 int val;       // Object Varible/ Non Static Varible/ instance Varible
	 int val2;      // Object Varible/ Non Static Varible/ instance Varible
	static int a=20; // Class varible
    
	public A(){
		val=12;
		val2=14;
	}
	
	public int get() {
		 return this.val;
	}
    
    public static void fun(){     // Static function..
        System.out.println(val); // Object  Varible.  ( // Error )
    }
}

public class Main {
    public static void main(String[] args) {
        
        A obj = new A();
       A.fun();
       obj.fun();
    }
}
