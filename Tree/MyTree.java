package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyTree {

	 TreeNode root=null;
	 
	 Scanner s= new Scanner(System.in);
	 MyTree(){
		 root= BuildTree();
	 }
	 
	private TreeNode BuildTree() {
		
		System.out.println("Enter the data");
		String data= s.next();
		if(data.equals("null")) {
			return null;
		}
		TreeNode root= new TreeNode(Integer.parseInt(data));
        System.out.println("Enter the left child of "+data);
		root.left= BuildTree(); // left
		System.out.println("Enter the right child of "+ data);
		root.right= BuildTree(); // Right
		
		return root;
	}
	
	public void preorder(TreeNode root) {
		
		if(root==null) {// -ve Base case
			return;
		}
		// root Value
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
	}
	public void Inorder(TreeNode root) {
		
		if(root==null) {// -ve Base case
			return;
		}
		
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
	}
	
	public void postOrder(TreeNode root) {
		
		if(root==null) {// -ve Base case
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public int Sum(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		int leftSum=Sum(root.left);
		int rightSum= Sum(root.right);
		int meraSum= leftSum+rightSum+root.data;
		return meraSum;
	}
	
	public void bfs(TreeNode root) {
		
		if(root==null) {
			return;
		}
		LinkedList<TreeNode> q= new LinkedList();
		q.add(root);
		while(q.size()>0) {
			// remove
			  TreeNode rm= q.removeFirst();  
			// work
			  System.out.print(rm.data+" ");
			// add the children
			  if(rm.left !=null) {
				 q.add(rm.left); 
			  }
			  if(rm.right !=null) {
				  q.add(rm.right);  
			  }
		}
	}
	 
}
