package LinkedList;

public class MylinkedList {

	private Node head;
	
	MylinkedList(){
		head=null;
	}
	
	public void InsertAtbegin(int val) {
		
		Node newNode= new Node(val);
		newNode.next=head;
		head= newNode;
	}
	
	public void display() {
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ "->");
			temp=temp.next;
		}
	}
	
	public void InsertAtEnd(int val) {
		
		if(head==null) {
			InsertAtbegin(val);
			return;
		}
		Node newNode= new Node(val);
		// finding the Tail Node
		Node temp=head;
		while(temp.next !=null) {
			temp=temp.next;
		}
		// creating a link between Tail Node to newNode...
		temp.next=newNode;
	}
}
