package LinkedList;

public class client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MylinkedList list= new MylinkedList();
     
     
     list.InsertAtbegin(10);
     list.InsertAtEnd(30);
     list.InsertAtbegin(100);
     list.display();
     list.removeAtBegin();
     
     list.display();
     list.InsertAtbegin(200);
     list.removeAtEnd();
     list.display();
     
//     list.InsertAtbegin(20);
//     list.InsertAtbegin(40);
//     list.InsertAtbegin(60);
     
//       for(int i=1; i<=4;i++) {
//    	   list.InsertAtbegin(i);
//       }
       
//       list.InsertAtEnd(30);
//     
//     list.display();
	}

}
