// "static void main" must be defined in a public class.
// Public :-  Access Everywhere
// private :- Access within  Class;
// Default :- No keyword is required and 
//            Visible only on Sam Package.
// Final :-   It make your Varible to a constant varible.

// Static function
//  Static function can accessable through class Name as well as object Name.



// Non Static function
 // from Inside non static function -> we can access both Static and Non Statics Things.
 
class A { 
	// State
	 int val;       // Object Varible/ Non Static Varible/ instance Varible
	 int val2;      // Object Varible/ Non Static Varible/ instance Varible
	static int a=20; // Class varible
    
	public A(){
		val=12;
		val2=14;
	}
	
	public void get() {  // Instance function
        System.out.println(a);
	}
    
    // public static void fun(){     // Static function..
    //     System.out.println(val); // Object  Varible.
    // }
}

public class Main {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.get();
        System.out.println(obj.a);
    }
}
