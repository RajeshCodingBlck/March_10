package Modifier_1;

// Public :-  Access Everywhere
// private :- Access within  Class;
// Default :- No keyword is required and 
//            Visible only on Sam Package.
// Final :-   It make your Varible to a constant varible.

// Static Varible
 // create a class Area/ Method
// Static Varible is also accessable by class Name and object Name.
//

public class A {
     
	// State
	 int val;       // Object Varible/ Non Static Varible/ instance Varible
	 int val2;      // Object Varible/ Non Static Varible/ instance Varible
	 
	static int a=20;
	
//	static int a=20; // Class varible
//    int a=12;     // Object varible// Class varible
	public A(){
		val=12;
		val2=14;
	}
	
	public int get() {
		 return this.val;
	}
}
