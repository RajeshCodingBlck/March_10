package LinkedList;

import java.util.LinkedList;

public class inbuitLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<Integer> list= new LinkedList();
      //System.out.println(list);
      list.addFirst(10);
      list.addFirst(20);
      list.addFirst(40);
      list.addLast(30);
     
      //System.out.println(list);
      
//      list.removeFirst();
      list.removeLast();
      System.out.println(list);
      
//      list.add(3, 50);
//      System.out.println(list);
      
//       Size S insert -> [0, S]
      
//        list.remove(4);
        System.out.println(list);
        
//        List Size S Remove [0, S-1]
        
//         System.out.println(list.get(3));
//         List S Get -> [0, S-1]
         
         list.set(0, 12); // Update
         System.out.println(list);
      
	}

}
