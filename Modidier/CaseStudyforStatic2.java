// "static void main" must be defined in a public class.
// Public :-  Access Everywhere
// private :- Access within  Class;
// Default :- No keyword is required and 
//            Visible only on Sam Package.
// Final :-   It make your Varible to a constant varible.

// Static Varible
 // create a class Area/ Method
// Static Varible is also accessable by class Name and object Name.

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
}

public class Main {
    public static void main(String[] args) {
        
        A obj = new A();
        A obj2= new A();
        System.out.println(obj.a);
        obj.a++;
        System.out.println(obj2.a);

      // Output
      // 20 
      // 21
    }
}
