package PriorityQueue;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       MyPriorityQueue pq= new MyPriorityQueue();
       
       pq.add(10);
       pq.add(2);
       pq.add(13);
       pq.add(5);
       
       System.out.println(pq.peek());
       pq.remove();
       System.out.println(pq.peek());
	}

}
