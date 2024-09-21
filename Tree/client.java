package Tree;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         TreeNode n1= new TreeNode(1);
//         TreeNode n2= new TreeNode(2);
//         TreeNode n3= new TreeNode(3);
//         TreeNode n4= new TreeNode(4);
//         
//         n1.left=n2;
//         n1.right=n3;
//         n2.left=n4;
		
		 MyTree t= new MyTree();
		  t.preorder(t.root);
		  System.out.println();
		// System.out.println("12"+3);
         //System.out.println("Sum is "+t.Sum(t.root));
        // printPath(t.root, "", 0);
           t.bfs(t.root);
	}
	
	public static void printPath(TreeNode root, String ans, int sum) {
		
		   if(root==null) {// -ve Base Case
			   return;
		   }
	      if(root.left==null && root.right==null) { // +ve  
	    	  System.out.println(ans+ root.data+ "-> Sum is "+(sum+root.data));
	    	  return;
	      }
	      printPath(root.left, ans+root.data, sum+root.data);
	      printPath(root.right, ans+root.data, sum+root.data);
	      
	}
// 1 2 4 null null null 3 5 null null 6 null null
}
