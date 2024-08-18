package MyQueue;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     
		MyQueue q= new MyQueue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(60);
		
//		System.out.println(q.front());
//		q.dequeue();
//		System.out.println(q.front());
//		q.dequeue();
//		System.out.println(q.front());
//		q.dequeue();
//		System.out.println(q.front());
	}

}
