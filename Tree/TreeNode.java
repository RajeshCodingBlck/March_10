package Tree;

public class TreeNode {
     
	int data;
	TreeNode left;
	TreeNode right;
//	LinkedList<TreeNode> child;
	
	TreeNode(int data){
		this.data=data;
	}
	TreeNode(int data, TreeNode left){
		this.data=data;
		this.left=left;
	}
	TreeNode(int data, TreeNode left, TreeNode right){
		this.data=data;
		this.left=left;
		this.right=right;
	}	
}
