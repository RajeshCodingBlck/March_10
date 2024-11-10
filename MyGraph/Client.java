package MyGraph;

import java.util.*;
import java.util.Scanner;

public class Client {

	// Converting Edge List to Adjacent List
	public static ArrayList<Integer> [] get(int [][] edgeList, int n){
		
		 ArrayList<Integer> [] arr= new ArrayList[n];
		 for(int i=0; i<n;i++) {
				arr[i]= new ArrayList();
//				System.out.println(i+ "---->"+ arr[i]);
		 }
		 
		 for(int i=0; i<edgeList.length;i++) {
			 
			 int u= edgeList[i][0];
			 int v= edgeList[i][1];
			 arr[u].add(v);
			 arr[v].add(u);
		 }
		 return arr;	
	}
	
	// Converting Edge List to Adjacent Matrix
	public static int [][] get2(int [][] edgeList, int n){
		
		int [][] arr= new int[n][n];
		
		for(int i=0; i<edgeList.length;i++) {
			 
			 int u= edgeList[i][0];
			 int v= edgeList[i][1];
			 arr[u][v]=1;
			 arr[v][u]=1;
		 }
		 return arr;	
	}
	
	// Connected Graph
	public static void BFS(ArrayList<Integer> [] arr) {
		
		LinkedList<Integer> q= new LinkedList();
		int n= arr.length;
		int [] visited= new int[n];	
		q.addLast(0);
//		visited[0]=1;
		while(q.size()>0) {
			// remove
			int rm= q.removeFirst();
			if(visited[rm]==1) {
				continue;
			}
			visited[rm]=1;
			// work
			System.out.print(rm+" , ");
			// add their Neighbours
			ArrayList<Integer> nbList= arr[rm];
			for(int nb : nbList ) {
				if(visited[nb]==0) {
					q.addLast(nb);
//					visited[nb]=1;
				}
			}
			
		}
		
	}
	
	// Disconnect Graph 
	public static int BFSDisconnected(ArrayList<Integer> [] arr, int src,
			 int [] visited) {
		
		LinkedList<Integer> q= new LinkedList();
		int count=0;
		int n= arr.length;	
		q.addLast(src);
		visited[src]=1;
		count++;
		while(q.size()>0) {
			// remove
			int rm= q.removeFirst();
//			if(visited[rm]==1) {
//				continue;
//			}
			visited[rm]=1;
			// work
			//System.out.print(rm+" , ");
			// add their Neighbours
			ArrayList<Integer> nbList= arr[rm];
			for(int nb : nbList ) {
				if(visited[nb]==0) {
					q.addLast(nb);
					visited[nb]=1;
					count++;
				}
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Graph g= new Graph(5,3);
      Scanner s= new Scanner(System.in);
      for(int i=0;i<3;i++) {
    	  int u= s.nextInt();
    	  int v= s.nextInt();
    	  g.addEdge(u,v);
      }
      ArrayList<Integer> [] arr= get(g.arr,5);
       
      int [] visited= new int[5];
      int countComponent=0;
      for(int i=0; i<5;i++) {
    	  if(visited[i]==0) {
    		  //System.out.println("Hello");
    		  countComponent++;
    		 int count= BFSDisconnected(arr, i, visited); 
    	      System.out.println(i+ " ->"+ count);
    	  }
      }
      System.out.println();
      System.out.println(countComponent);
      
      
     // BFS(arr);
     // g.display();
	}

}
