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
		
		System.out.println();
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
	
	public void removeAtBegin() {
		
		 if(head==null) {
			 return;
		 }
		  //head=head.next;
		 Node temp= head;
		 head=head.next; // shift by one
		 temp.next=null; // Link break ho jata he.	 	 
	}
	
	public void removeAtEnd() {
		
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node temp=head;
		while(temp.next.next !=null) {
			temp= temp.next;
		}
		temp.next=null;
		
	}
	
	public int size() {
		
		int size=0;
		Node temp= head;
		while(temp !=null) {
			
			size++;
			temp=temp.next;	
		}
		return size;
	}
	
	public void addAtIndex(int index, int val) {
		
		Node temp= head;
		int jump=index-1;
		
		while(jump>0) {
			temp=temp.next;
			jump--;
		}
		Node temp2=  temp.next;
		Node newNode= new Node(val);
		temp.next=newNode;
		newNode.next=temp2;
		
	}
	
	public void removeAtIndex(int index) {
		
		Node temp= head;
		int jump=index-1;
		
		while(jump>0) {
			temp=temp.next;
			jump--;
		}
		Node temp2= temp.next;
		temp.next=temp2.next;
		temp2.next=null;
		
		
	}
	
	
}
