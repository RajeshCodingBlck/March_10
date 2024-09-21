package Tree;

import java.util.LinkedList;
import java.util.Scanner;

public class MyTreeBFS {

	TreeNode root = null;
	Scanner s = new Scanner(System.in);

	MyTreeBFS() {
		root = BuildBFS();
	}

	private TreeNode BuildBFS() {
		// TODO Auto-generated method stub
		
		LinkedList<TreeNode> q= new LinkedList();
		System.out.println("Enter the root data");
		String data= s.next();
		 TreeNode root= new TreeNode(Integer.parseInt(data));
         
		  q.add(root);
		 while(q.size()>0) {
			 
			 // remove the Node
			 TreeNode rm= q.removeFirst();
			 
			 // work
			 // leftChild
			 System.out.println("Enter the LeftChild data of "+rm.data);
			 String leftData= s.next();
			 if(leftData.equals("null")==false) {

			TreeNode leftChild= new TreeNode(Integer.parseInt(leftData));
				rm.left=leftChild; 
			 }
			 System.out.println("Enter the rightChild data of "+rm.data);
			 String rightData= s.next();
			 if(rightData.equals("null")==false) {
              TreeNode rightChild= new TreeNode(Integer.parseInt(rightData));
		        rm.right=rightChild;// Linking	
			 }
			 
			 
			 // add their Children
			 if(rm.left!=null) {
				 q.add(rm.left);
			 }
			 if(rm.right !=null) {
				 q.add(rm.right);
			 }
			 
		 }
	   return root;	 
	}
}
