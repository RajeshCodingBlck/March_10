package MyGraph;

import java.util.ArrayList;

public class Graph {
     
//	Edge List 
	int [][]arr;
    int index;
	Graph(int n, int e){
         index=0;
		arr= new int[e][2];
	}
	
//	0 1 1 3 1 2 0 2 2 3 2 4 3 4 3 5 4 5
//	int [][]arr;
//	Graph(int n, int e){
//		arr= new int [n][n];
//	}
	
	
//	ArrayList<Integer> [] arr;
//	
//	Graph(int n, int e){
//		arr= new ArrayList[n];
//		for(int i=0; i<n;i++) {
//			arr[i]= new ArrayList();
//			System.out.println(i+ "---->"+ arr[i]);
//		}
//	}
	
	public void addEdge(int u, int v) {
		
//		Edge List
		arr[index][0]=u;
		arr[index][1]=v;
		index++;
		// Adjacent Matrix
//		arr[u][v]=1;
//		arr[v][u]=1;
		
//		// Adjacent List 
//		arr[u].add(v);
//		arr[v].add(u);
		
	}
	
	public void display() {
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(i+" -> "+"{ ");
			for(int nb :arr[i]) {
				System.out.print(nb+" , ");
			}
			System.out.println(" }");
		}
	}
	
	
}
