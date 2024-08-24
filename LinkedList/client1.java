package LinkedList;

public class client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Node n1= new Node(12);
		Node n2= new Node(13);
		Node n3= new Node(14);
		
		// Creating a link  from n1 to n2
		n1.next=n2;
		// Creating a link  from n2 to n3
		n2.next=n3;
		
		Node head= n1; // ak object ke do Naam.
		//System.out.println(n2.next+ " "+ n1.next);
		System.out.println(n1.next.data);
		
		Node temp=head;
		
		temp= temp.next;// Shifting  ka tarika
		
		
	}

}
