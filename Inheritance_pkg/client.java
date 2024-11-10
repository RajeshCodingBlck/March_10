package Inheritance_pkg;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		B obj= new B();
		System.out.println(obj.val1);
	}
	
	// case 1: 
//	   Private Varible can't Inherited
	
	 //Case 2:
//		Parent ka Parametrized constructor he to Child
//		 constructor ka constructor hona jaruri he and 
//		 parent ke constructor ko call karne ke kya use karo Super

//   Case 3:
//	   call to super must be first statement in constructor of child
	
//	 Case4 :
//		 Parent Constructor is called first then Child constructor

	
//	Case 5 :
//		Static function doesn't Super and this keyword
}
