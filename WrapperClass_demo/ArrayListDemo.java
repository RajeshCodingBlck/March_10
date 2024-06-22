package WrapperClass_demo;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<Integer> arr= new ArrayList();
       System.out.println(arr);
       
       // How to add the Element
       arr.add(12);
       System.out.println(arr);
       
       arr.add(13);
       System.out.println(arr);
       
       arr.add(15);
       System.out.println(arr);
       
       // remove 
//       arr.remove(2);
//       System.out.println(arr);
       
       
//       arr.add(3,50);
//       System.out.println(arr);
       
       // read
        System.out.println(arr.get(2));
        
        // Update
        arr.set(0, 20);
        
        System.out.println(arr);
        
       
       
       
       
       
       
	}

}
